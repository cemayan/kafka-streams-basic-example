package com.ca.engine.model;

import com.ca.api.schema.EventName;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Table("RULES_MANAGEMENT")
public class RuleManagement {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @Column("RULE1")
    private Long rule1;

    @Column("RULE2")
    private Long rule2;

    @Column("LOGIC_OPERATOR")
    private LogicOperator logicOperator;

    @Column("TIME_SELECTOR")
    private TimeSelector timeSelector;

    @Column("TIME_VALUE")
    private Long timeValue;


    @Column("STATUS")
    private boolean status;

    public RuleManagement(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRule1() {
        return rule1;
    }

    public void setRule1(Long rule1) {
        this.rule1 = rule1;
    }

    public Long getRule2() {
        return rule2;
    }

    public void setRule2(Long rule2) {
        this.rule2 = rule2;
    }

    public LogicOperator getLogicOperator() {
        return logicOperator;
    }

    public void setLogicOperator(LogicOperator logicOperator) {
        this.logicOperator = logicOperator;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public TimeSelector getTimeSelector() {
        return timeSelector;
    }

    public void setTimeSelector(TimeSelector timeSelector) {
        this.timeSelector = timeSelector;
    }

    public Long getTimeValue() {
        return timeValue;
    }

    public void setTimeValue(Long timeValue) {
        this.timeValue = timeValue;
    }
}
