package com.ca.api.service;

import com.ca.api.dto.EventDTO;
import com.ca.api.schema.Events;
import org.apache.avro.generic.GenericRecord;
import org.springframework.cloud.stream.function.StreamBridge;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@Service
public class KafkaProducerServiceImpl implements KafkaProducer {

    private final KafkaTemplate<String, GenericRecord> kafkaTemplate;


    public KafkaProducerServiceImpl(KafkaTemplate<String, GenericRecord> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void addQueue(EventDTO event) throws IOException {

        Events events = Events.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setUserId(event.getUserId())
                .setEventName(event.eventName)
                .setEventData(event.getEventData())
                .setEventDate(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC))
                .build();

        kafkaTemplate.send("events", events);
        }

}
