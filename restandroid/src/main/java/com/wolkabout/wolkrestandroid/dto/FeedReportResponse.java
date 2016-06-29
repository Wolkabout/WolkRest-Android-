package com.wolkabout.wolkrestandroid.dto;

import java.util.List;

public class FeedReportResponse {

    private final Integer feedId;
    private final String name;
    private final String readingType;
    private final List<AggregatedReadingResponse> readings;
    private final ReadingResponse min;
    private final ReadingResponse max;
    private final List<MessageResponse> messages;

    public FeedReportResponse(Integer feedId, String name, String readingType, List<AggregatedReadingResponse> readings, ReadingResponse min, ReadingResponse max, List<MessageResponse> messages) {
        this.feedId = feedId;
        this.name = name;
        this.readingType = readingType;
        this.readings = readings;
        this.min = min;
        this.max = max;
        this.messages = messages;
    }

    public Integer getFeedId() { return feedId; }

    public String getName() { return name; }

    public String getReadingType() { return readingType; }

    public List<AggregatedReadingResponse> getReadings() { return readings; }

    public ReadingResponse getMin() { return min; }

    public ReadingResponse getMax() { return max; }

    public List<MessageResponse> getMessages() { return messages; }

}
