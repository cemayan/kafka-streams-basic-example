package com.ca.engine.util;

import com.ca.api.schema.Events;
import com.ca.engine.model.Config;
import com.ca.engine.model.TimeSelector;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.kstream.Windowed;

import java.time.Duration;

public class ConditionUtils {

    public static KTable<Windowed<String>, Long> getKtable(Config config,
                                                           KTable<Windowed<String>, Long> aggregtedStream  ) {

        switch (config.getCondition()) {
            case EQUAL:
                aggregtedStream =
                        aggregtedStream.filter((x, y) -> y.equals(config.getConditionValue()));
                break;
            case NOT_EQUAL:
                aggregtedStream =
                        aggregtedStream.filter((x, y) -> !y.equals(config.getConditionValue()));
                break;
            case GREATER_THAN:
                aggregtedStream =
                        aggregtedStream.filter((x, y) -> y > config.getConditionValue());
                break;
            case LESS_THAN:
                aggregtedStream =
                        aggregtedStream.filter((x, y) -> y < config.getConditionValue());
                break;
            case GREATER_THAN_EQUEAL:
                aggregtedStream =
                        aggregtedStream.filter((x, y) -> y >= config.getConditionValue());
                break;
            case LESS_THAN_EQUAL:
                aggregtedStream =
                        aggregtedStream.filter((x, y) -> y >= config.getConditionValue());
                break;


        }
        return aggregtedStream;

    }
}
