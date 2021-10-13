package com.ca.engine.service.impl;


import com.ca.api.schema.Events;
import com.ca.engine.model.*;
import com.ca.engine.service.StreamService;
import com.ca.engine.util.ConditionUtils;
import com.ca.engine.util.TimeUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import java.time.Duration;


@Service
public class StreamServiceImpl implements StreamService {

    Logger logger = LoggerFactory.getLogger(StreamServiceImpl.class);


    @Qualifier("streamsBuilder")
    private final StreamsBuilder streamsBuilder;
    private final ObjectMapper objectMapper;

    public StreamServiceImpl(StreamsBuilder streamsBuilder, ObjectMapper objectMapper) {
        this.streamsBuilder = streamsBuilder;
        this.objectMapper = objectMapper;
    }

    @Override
    public Topology getTopology(
            Mono<Rule> ruleMono,
            Mono<Rule> ruleMono2,
            Mono<RuleManagement> ruleManagementMono
            ) {

        Rule rule = ruleMono.block();
        Rule rule2 = ruleMono2.block();
        RuleManagement ruleManagement  = ruleManagementMono.block();


        Config config = new Config();
        Config config2 = new Config();

        KStream<String, Events> kStream = streamsBuilder.stream("events");

        KTable<Windowed<String>, Long> aggregatedTable = null;
        KTable<Windowed<String>, Long> aggregatedTable2 = null;

        if (rule != null && rule2 != null && ruleManagement != null) {
            try {
                config = objectMapper.readValue(rule.getConfig(), Config.class);
                config2 = objectMapper.readValue(rule2.getConfig(), Config.class);
            } catch (JsonProcessingException e) {
                logger.error(e.getMessage(), e);
            }

            KStream<String, Events> filteredStream = kStream.
                    filter((key, value) -> value.getEventName() == rule.getEventName());

            KStream<String, Events> filteredStream2 = kStream.
                    filter((key, value) -> value.getEventName() == rule2.getEventName());


            Duration currentDuration =
                    TimeUtils.getDuration(config.getTimeSelector(), config.getConditionValue());

            Duration currentDuration2 =
                    TimeUtils.getDuration(config2.getTimeSelector(), config2.getConditionValue());


            if (config.getAggregatorMethod().equals(AggregatorMethod.COUNT)) {
                aggregatedTable = filteredStream
                        .selectKey((k,v) -> v.getUserId().toString())
                        .groupByKey()
                        .windowedBy(TimeWindows.of(currentDuration))
                        .count();
            }

            if (config2.getAggregatorMethod().equals(AggregatorMethod.COUNT)) {
                aggregatedTable2 = filteredStream2
                        .selectKey((k,v) -> v.getUserId().toString())
                        .groupByKey()
                        .windowedBy(TimeWindows.of(currentDuration2))
                        .count();
            }


            aggregatedTable = ConditionUtils.getKtable(config, aggregatedTable);
            aggregatedTable2 = ConditionUtils.getKtable(config2, aggregatedTable2);

            Duration joinDuration =
                    TimeUtils.getDuration(ruleManagement.getTimeSelector(), ruleManagement.getTimeValue());

            KStream<String, String> lastStream = aggregatedTable.toStream()
                    .map((key, value) -> new KeyValue<>(key.key(), key.key()));

            KStream<String, String> lastStream2 = aggregatedTable2.toStream()
                    .map((key, value) -> new KeyValue<>(key.key(), key.key()));


            KStream<String, String> joinedStream = lastStream.join(lastStream2,
                    (s, s2) -> s,
                    JoinWindows.of(joinDuration),
                    StreamJoined.with(Serdes.String(), Serdes.String(), Serdes.String()));

            joinedStream.to("events-out-final", Produced.with(Serdes.String(),Serdes.String()));
        }

        return streamsBuilder.build();
    }
}
