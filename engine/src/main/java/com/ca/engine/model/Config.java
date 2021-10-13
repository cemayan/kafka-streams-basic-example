package com.ca.engine.model;


public class Config {

    private AggregatorMethod aggregatorMethod;
    private Condition condition;
    private Long conditionValue;
    private TimeSelector timeSelector;

    public Config() {

    }

    public Config(AggregatorMethod aggregatorMethod, Condition condition, Long conditionValue, TimeSelector timeSelector) {
        this.aggregatorMethod = aggregatorMethod;
        this.condition = condition;
        this.conditionValue = conditionValue;
        this.timeSelector = timeSelector;
    }

    public AggregatorMethod getAggregatorMethod() {
        return aggregatorMethod;
    }

    public void setAggregatorMethod(AggregatorMethod aggregatorMethod) {
        this.aggregatorMethod = aggregatorMethod;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Long getConditionValue() {
        return conditionValue;
    }

    public void setConditionValue(Long conditionValue) {
        this.conditionValue = conditionValue;
    }

    public TimeSelector getTimeSelector() {
        return timeSelector;
    }

    public void setTimeSelector(TimeSelector timeSelector) {
        this.timeSelector = timeSelector;
    }


}
