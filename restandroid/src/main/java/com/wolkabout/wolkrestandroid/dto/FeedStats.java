package com.wolkabout.wolkrestandroid.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedStats {

    private int feedId;
    private double sum;
    private double average;
    private int count;

    public FeedStats() {
    }

    public FeedStats(int feedId, double sum, double average, int count) {
        this.feedId = feedId;
        this.sum = sum;
        this.average = average;
        this.count = count;
    }

    public int getFeedId() {
        return feedId;
    }

    public void setFeedId(int feedId) {
        this.feedId = feedId;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "FeedStats{" +
                "feedId=" + feedId +
                ", sum=" + sum +
                ", average=" + average +
                ", count=" + count +
                '}';
    }
}
