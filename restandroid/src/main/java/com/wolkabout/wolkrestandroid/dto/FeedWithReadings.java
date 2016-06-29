package com.wolkabout.wolkrestandroid.dto;

import java.util.List;

public class FeedWithReadings {

    private final Integer feedId;
    private final List<ReadingResponse> readings;

    public FeedWithReadings(Integer feedId, List<ReadingResponse> readings) {
        this.feedId = feedId;
        this.readings = readings;
    }

    public Integer getFeedId() { return feedId; }

    public List<ReadingResponse> getReadings() { return readings; }

}
