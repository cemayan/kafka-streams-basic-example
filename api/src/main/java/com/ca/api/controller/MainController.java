package com.ca.api.controller;

import com.ca.api.dto.EventDTO;
import com.ca.api.service.KafkaProducerServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
public class MainController {

    private final KafkaProducerServiceImpl kafkaProducerService;

    public MainController(KafkaProducerServiceImpl kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping("/sendEvent")
    public Mono<ResponseEntity> addQueue(@RequestBody EventDTO event) {
        try {
            kafkaProducerService.addQueue(event);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Mono.just( ResponseEntity.ok().build());
    }

}
