package com.wolkabout.wolkrestandroid.dto;

import java.util.List;

public class UpdatePointBodyDTO {

    private String name;
    private int heartbeat;
    private List<FeedConfig> feeds;

    public UpdatePointBodyDTO() {
    }

    public UpdatePointBodyDTO(String name, int heartbeat, List<FeedConfig> feeds) {
        this.name = name;
        this.heartbeat = heartbeat;
        this.feeds = feeds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(int heartbeat) {
        this.heartbeat = heartbeat;
    }

    public List<FeedConfig> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<FeedConfig> feeds) {
        this.feeds = feeds;
    }

    @Override
    public String toString() {
        return "UpdatePointBodyDTO{" +
                "name='" + name + '\'' +
                ", heartbeat=" + heartbeat +
                ", feeds=" + feeds +
                '}';
    }
}
