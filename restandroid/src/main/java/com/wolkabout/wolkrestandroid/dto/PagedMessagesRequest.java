package com.wolkabout.wolkrestandroid.dto;

public class PagedMessagesRequest {

    private final Long from;
    private final Integer pageSize;

    public PagedMessagesRequest(Long from, Integer pageSize) {
        this.from = from;
        this.pageSize = pageSize;
    }

    public Long getFrom() { return from; }

    public Integer getPageSize() { return pageSize; }

}
