package com.wolkabout.wolkrestandroid.dto;

public class UnreadMessagesRequest {

    private final Integer pointId;
    private final Long from;
    private final Long to;

    public UnreadMessagesRequest(Integer pointId, Long from, Long to) {
        this.pointId = pointId;
        this.from = from;
        this.to = to;
    }

    public Integer getPointId() { return pointId; }

    public Long getFrom() { return from; }

    public Long getTo() { return to; }

}
