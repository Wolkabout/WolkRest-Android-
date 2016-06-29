package com.wolkabout.wolkrestandroid.dto;

import java.util.List;

public class UpdatePointBodyDTO {

    private final String name;
    private final Integer heartbeat;
    private final List<FeedConfig> feeds;

    public UpdatePointBodyDTO(String name, Integer heartbeat, List<FeedConfig> feeds) {
        this.name = name;
        this.heartbeat = heartbeat;
        this.feeds = feeds;
    }

    public String getName() { return name; }

    public Integer getHeartbeat() { return heartbeat; }

    public List<FeedConfig> getFeeds() { return feeds; }

}
