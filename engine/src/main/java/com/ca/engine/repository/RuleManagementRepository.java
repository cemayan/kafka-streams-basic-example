package com.ca.engine.repository;


import com.ca.engine.model.Rule;
import com.ca.engine.model.RuleManagement;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface RuleManagementRepository extends ReactiveCrudRepository<RuleManagement, Long> {
    Mono<RuleManagement> findRuleManagementById(Long id);
}
