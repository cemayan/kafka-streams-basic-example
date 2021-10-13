package com.ca.engine.model;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;

public class StreamModel {
    private StreamsBuilder streamsBuilder;
    private KStream kStream;
    private KTable kTable;

    public StreamModel(StreamsBuilder streamsBuilder, KStream kStream, KTable kTable) {
        this.streamsBuilder = streamsBuilder;
        this.kStream = kStream;
        this.kTable = kTable;
    }

    public StreamsBuilder getStreamsBuilder() {
        return streamsBuilder;
    }

    public void setStreamsBuilder(StreamsBuilder streamsBuilder) {
        this.streamsBuilder = streamsBuilder;
    }

    public KStream getkStream() {
        return kStream;
    }

    public void setkStream(KStream kStream) {
        this.kStream = kStream;
    }

    public KTable getkTable() {
        return kTable;
    }

    public void setkTable(KTable kTable) {
        this.kTable = kTable;
    }
}
