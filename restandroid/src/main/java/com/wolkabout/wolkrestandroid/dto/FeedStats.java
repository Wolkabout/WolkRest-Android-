package com.wolkabout.wolkrestandroid.dto;

public class FeedStats {

    private final Integer feedId;
    private final Double sum;
    private final Double average;
    private final Integer count;

    public FeedStats(Integer feedId, Double sum, Double average, Integer count) {
        this.feedId = feedId;
        this.sum = sum;
        this.average = average;
        this.count = count;
    }

    public Integer getFeedId() { return feedId; }

    public Double getSum() { return sum; }

    public Double getAverage() { return average; }

    public Integer getCount() { return count; }

}
