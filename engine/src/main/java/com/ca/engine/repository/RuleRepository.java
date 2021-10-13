package com.ca.engine.repository;


import com.ca.engine.model.Rule;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuleRepository extends ReactiveCrudRepository<Rule, Long> {
}
