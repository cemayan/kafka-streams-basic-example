package com.ca.api.dto;

import com.ca.api.schema.EventName;

import java.util.Map;

public class EventDTO {
    public EventName eventName;
    public String userId;
    public Map<CharSequence, CharSequence> eventData;

    public EventName getEventName() {
        return eventName;
    }

    public void setEventName(EventName eventName) {
        this.eventName = eventName;
    }

    public Map<CharSequence, CharSequence> getEventData() {
        return eventData;
    }

    public void setEventData(Map<CharSequence, CharSequence> eventData) {
        this.eventData = eventData;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
