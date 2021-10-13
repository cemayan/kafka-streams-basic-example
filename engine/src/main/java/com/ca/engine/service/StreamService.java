package com.ca.engine.service;

import com.ca.engine.model.Rule;
import com.ca.engine.model.RuleManagement;
import com.ca.engine.model.StreamModel;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.KTable;
import reactor.core.publisher.Mono;

public interface StreamService {
    Topology getTopology(Mono<Rule> ruleMono, Mono<Rule> ruleMono2, Mono<RuleManagement> ruleManagementMono);
}
