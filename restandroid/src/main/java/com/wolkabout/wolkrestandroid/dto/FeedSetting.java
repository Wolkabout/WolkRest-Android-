package com.wolkabout.wolkrestandroid.dto;

public class FeedSetting {

    private final Integer id;
    private final Integer order;

    public FeedSetting(Integer id, Integer order) {
        this.id = id;
        this.order = order;
    }

    public Integer getId() { return id; }

    public Integer getOrder() { return order; }

}
