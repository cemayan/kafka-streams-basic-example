package com.ca.engine.service;

import com.ca.engine.dto.RuleDTO;
import com.ca.engine.dto.RuleManagementDTO;
import com.ca.engine.model.Rule;
import com.ca.engine.model.RuleManagement;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

public interface RuleService {
    Mono<Rule> saveRule(RuleDTO ruleDTO);
    Mono<RuleManagement> saveRuleManagement(RuleManagementDTO ruleManagementDTO);
    void triggerRule(Long id);
}
