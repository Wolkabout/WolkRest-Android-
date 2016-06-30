package com.wolkabout.wolkrestandroid.dto;

import java.util.List;

public class FeedsRequest {

    private List<Integer> feedIds;
    private long from;
    private long to;

    public FeedsRequest() {
    }

    public FeedsRequest(List<Integer> feedIds, long from, long to) {
        this.feedIds = feedIds;
        this.from = from;
        this.to = to;
    }

    public List<Integer> getFeedIds() {
        return feedIds;
    }

    public void setFeedIds(List<Integer> feedIds) {
        this.feedIds = feedIds;
    }

    public long getFrom() {
        return from;
    }

    public void setFrom(long from) {
        this.from = from;
    }

    public long getTo() {
        return to;
    }

    public void setTo(long to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "FeedsRequest{" +
                "feedIds=" + feedIds +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
