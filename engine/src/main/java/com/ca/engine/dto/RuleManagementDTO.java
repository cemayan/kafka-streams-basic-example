package com.ca.engine.dto;

import com.ca.engine.model.Condition;
import com.ca.engine.model.LogicOperator;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


public class RuleManagementDTO {

    private Long rule1;
    private Long rule2;

    private LogicOperator logicOperator;
    private boolean status;

    public RuleManagementDTO(){

    }

    public RuleManagementDTO(Long rule1, Long rule2, LogicOperator logicOperator, boolean status) {
        this.rule1 = rule1;
        this.rule2 = rule2;
        this.logicOperator = logicOperator;
        this.status = status;
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
}
