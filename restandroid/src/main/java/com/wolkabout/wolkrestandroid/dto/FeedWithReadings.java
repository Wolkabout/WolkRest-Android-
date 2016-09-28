package com.wolkabout.wolkrestandroid.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedWithReadings {

    private int feedId;
    private List<ReadingResponse> readings;

    public FeedWithReadings() {
    }

    public FeedWithReadings(int feedId, List<ReadingResponse> readings) {
        this.feedId = feedId;
        this.readings = readings;
    }

    public int getFeedId() {
        return feedId;
    }

    public void setFeedId(int feedId) {
        this.feedId = feedId;
    }

    public List<ReadingResponse> getReadings() {
        return readings;
    }

    public void setReadings(List<ReadingResponse> readings) {
        this.readings = readings;
    }

    @Override
    public String toString() {
        return "FeedWithReadings{" +
                "feedId=" + feedId +
                ", readings=" + readings +
                '}';
    }
}
