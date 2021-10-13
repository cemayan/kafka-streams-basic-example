//package com.ca.api.functions;
//
//import com.ca.api.schema.Events;
//import com.ca.api.service.KafkaProducer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
//import java.util.function.Consumer;
//import java.util.function.Supplier;
//
//@Component
//public class EventProcessor {
//
//    private final KafkaProducer kafkaProducer;
//
//    public EventProcessor(KafkaProducer kafkaProducer) {
//        this.kafkaProducer = kafkaProducer;
//    }
//
//
//    @Bean
//    public Supplier<Events> sendEvent() {
//        return () -> kafkaProducer.getQueue().poll();
//    }
//
//    @Bean
//    public Consumer<Events> getEvent()  {
//        return input ->  {
//            System.out.println(input);
//        };
//    }
//
//}
