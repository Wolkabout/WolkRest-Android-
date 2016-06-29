package com.wolkabout.wolkrestandroid.dto;

import java.util.List;

public class FeedsRequest {

    private final List<Integer> feedIds;
    private final Long from;
    private final Long to;

    public FeedsRequest(List<Integer> feedIds, Long from, Long to) {
        this.feedIds = feedIds;
        this.from = from;
        this.to = to;
    }

    public List<Integer> getFeedIds() { return feedIds; }

    public Long getFrom() { return from; }

    public Long getTo() { return to; }

}
