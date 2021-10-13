package com.ca.engine.model;

public enum Condition {
    EQUAL("="),
    NOT_EQUAL("!="),
    GREATER_THAN(">"),
    LESS_THAN("<"),
    GREATER_THAN_EQUEAL(">="),
    LESS_THAN_EQUAL("<=");

    public final String symbol;

    private Condition(String symbol) {
        this.symbol = symbol;
    }

    }
