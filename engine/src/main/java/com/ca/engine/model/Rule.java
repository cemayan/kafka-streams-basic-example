package com.ca.engine.model;

import com.ca.api.schema.EventName;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Map;


@Table("RULES")
public class Rule {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @Column("RULE_NAME")
    private String ruleName;

    @Column("EVENT_NAME")
    private EventName eventName;

    @Column("CONFIG")
    private String config;

    public Rule() {

    }

    public Rule(String ruleName, EventName eventName, String config) {
        this.ruleName = ruleName;
        this.eventName = eventName;
        this.config = config;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public EventName getEventName() {
        return eventName;
    }

    public void setEventName(EventName eventName) {
        this.eventName = eventName;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
