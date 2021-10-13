package com.ca.engine.util;

import com.ca.engine.model.TimeSelector;

import java.time.Duration;

public class TimeUtils {

    public static Duration getDuration(TimeSelector timeSelector, Long value) {
        Duration currentDuration = null;

        switch (timeSelector) {
            case SECOND:
                currentDuration = Duration.ofSeconds(value);
                break;
            case MINUTE:
                currentDuration = Duration.ofMinutes(value);
                break;
            case HOUR:
                currentDuration = Duration.ofHours(value);
                break;
            case DAY:
                currentDuration = Duration.ofDays(value);
                break;
            default:
                currentDuration = Duration.ofMinutes(value);
                break;
        }
        return currentDuration;
    }
}
