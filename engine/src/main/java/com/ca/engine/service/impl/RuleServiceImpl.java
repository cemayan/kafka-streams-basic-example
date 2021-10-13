package com.ca.engine.service.impl;

import com.ca.engine.dto.RuleDTO;
import com.ca.engine.dto.RuleManagementDTO;
import com.ca.engine.mapper.RuleMapper;
import com.ca.engine.model.LogicOperator;
import com.ca.engine.model.Rule;
import com.ca.engine.model.RuleManagement;
import com.ca.engine.model.StreamModel;
import com.ca.engine.repository.RuleManagementRepository;
import com.ca.engine.repository.RuleRepository;
import com.ca.engine.service.RuleService;
import com.ca.engine.service.StreamService;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.Topology;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.config.KafkaStreamsConfiguration;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class RuleServiceImpl implements RuleService {

    private final RuleRepository ruleRepository;
    private final RuleManagementRepository ruleManagementRepository;
    private final StreamService streamService;

    @Qualifier("kStreamsConfigs")
    private final KafkaStreamsConfiguration defaultKafkaStreamsConfig;

    public RuleServiceImpl(RuleRepository ruleRepository,
                           RuleManagementRepository ruleManagementRepository,
                           StreamService streamService, KafkaStreamsConfiguration defaultKafkaStreamsConfig) {
        this.ruleRepository = ruleRepository;
        this.ruleManagementRepository = ruleManagementRepository;
        this.streamService = streamService;
        this.defaultKafkaStreamsConfig = defaultKafkaStreamsConfig;
    }

    @Override
    public Mono<Rule> saveRule(RuleDTO ruleDTO) {
        Rule rule = RuleMapper.INSTANCE.ruleDTOtoRule(ruleDTO);
        return ruleRepository.save(rule);
    }

    @Override
    public Mono<RuleManagement> saveRuleManagement(RuleManagementDTO ruleManagementDTO) {
        RuleManagement ruleManagement = RuleMapper.INSTANCE.ruleManagementDTOtoRuleManagement(ruleManagementDTO);
        return ruleManagementRepository.save(ruleManagement);
    }

    @Override
    public void triggerRule(Long id) {
        Mono<RuleManagement> ruleManagement = ruleManagementRepository.findById(id);
        Mono<Long> ruleId1 =  ruleManagement.map(RuleManagement::getRule1);
        Mono<Long> ruleId2 =  ruleManagement.map(RuleManagement::getRule2);
        Mono<LogicOperator> logicOperator = ruleManagement.map(RuleManagement::getLogicOperator);

        Mono<Rule> rule = ruleRepository.findById(ruleId1);
        Mono<Rule> rule2 = ruleRepository.findById(ruleId2);

        Topology topology = streamService.getTopology(rule,rule2,ruleManagement);
        KafkaStreams kafkaStreams = new KafkaStreams(topology,defaultKafkaStreamsConfig.asProperties());

        kafkaStreams.cleanUp();
        kafkaStreams.start();

    }
}
