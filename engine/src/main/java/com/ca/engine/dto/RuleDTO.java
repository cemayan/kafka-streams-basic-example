package com.ca.engine.dto;

import com.ca.api.schema.EventName;
import com.ca.engine.model.Config;

import java.util.Map;

public class RuleDTO {


    private String ruleName;
    private EventName eventName;
    private Config config;

    public RuleDTO() {

    }

    public RuleDTO(String ruleName, EventName eventName, Config config) {
        this.ruleName = ruleName;
        this.eventName = eventName;
        this.config = config;
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

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }
}
