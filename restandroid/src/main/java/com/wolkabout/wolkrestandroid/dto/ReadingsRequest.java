package com.wolkabout.wolkrestandroid.dto;

import com.wolkabout.wolkrestandroid.enumeration.AggregationLevel;

public class ReadingsRequest {

    private final Integer feedId;
    private final Long from;
    private final Long to;
    private final AggregationLevel aggregationLevel;

    public ReadingsRequest(Integer feedId, Long from, Long to, AggregationLevel aggregationLevel) {
        this.feedId = feedId;
        this.from = from;
        this.to = to;
        this.aggregationLevel = aggregationLevel;
    }

    public Integer getFeedId() {
        return feedId;
    }

    public Long getFrom() {
        return from;
    }

    public Long getTo() {
        return to;
    }

    public AggregationLevel getAggregationLevel() {
        return aggregationLevel;
    }

}
