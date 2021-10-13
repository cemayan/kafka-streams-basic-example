package com.ca.api.service;


import com.ca.api.dto.EventDTO;
import com.ca.api.schema.Events;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;

public interface KafkaProducer {
     void addQueue(EventDTO event) throws IOException;
}
