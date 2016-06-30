package com.wolkabout.wolkrestandroid.dto;

import java.util.List;

public class FeedReportResponse {

    private int feedId;
    private String name;
    private String readingType;
    private List<AggregatedReadingResponse> readings;
    private ReadingResponse min;
    private ReadingResponse max;
    private List<MessageResponse> messages;

    public FeedReportResponse() {
    }

    public FeedReportResponse(int feedId, String name, String readingType, List<AggregatedReadingResponse> readings, ReadingResponse min, ReadingResponse max, List<MessageResponse> messages) {
        this.feedId = feedId;
        this.name = name;
        this.readingType = readingType;
        this.readings = readings;
        this.min = min;
        this.max = max;
        this.messages = messages;
    }

    public int getFeedId() {
        return feedId;
    }

    public void setFeedId(int feedId) {
        this.feedId = feedId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReadingType() {
        return readingType;
    }

    public void setReadingType(String readingType) {
        this.readingType = readingType;
    }

    public List<AggregatedReadingResponse> getReadings() {
        return readings;
    }

    public void setReadings(List<AggregatedReadingResponse> readings) {
        this.readings = readings;
    }

    public ReadingResponse getMin() {
        return min;
    }

    public void setMin(ReadingResponse min) {
        this.min = min;
    }

    public ReadingResponse getMax() {
        return max;
    }

    public void setMax(ReadingResponse max) {
        this.max = max;
    }

    public List<MessageResponse> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageResponse> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "FeedReportResponse{" +
                "feedId=" + feedId +
                ", name='" + name + '\'' +
                ", readingType='" + readingType + '\'' +
                ", readings=" + readings +
                ", min=" + min +
                ", max=" + max +
                ", messages=" + messages +
                '}';
    }
}
