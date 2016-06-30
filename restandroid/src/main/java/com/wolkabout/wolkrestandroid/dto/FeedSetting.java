package com.wolkabout.wolkrestandroid.dto;

public class FeedSetting {

    private int id;
    private int order;

    public FeedSetting() {
    }

    public FeedSetting(int id, int order) {
        this.id = id;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "FeedSetting{" +
                "id=" + id +
                ", order=" + order +
                '}';
    }
}
