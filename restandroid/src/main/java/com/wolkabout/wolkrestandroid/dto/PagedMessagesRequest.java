package com.wolkabout.wolkrestandroid.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PagedMessagesRequest {

    private long from;
    private int pageSize;

    public PagedMessagesRequest() {
    }

    public PagedMessagesRequest(long from, int pageSize) {
        this.from = from;
        this.pageSize = pageSize;
    }

    public long getFrom() {
        return from;
    }

    public void setFrom(long from) {
        this.from = from;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "PagedMessagesRequest{" +
                "from=" + from +
                ", pageSize=" + pageSize +
                '}';
    }
}
