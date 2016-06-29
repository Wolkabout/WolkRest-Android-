package com.wolkabout.wolkrestandroid.dto;

import java.util.List;

public class PointConfig {

    private final Integer id;
    private final String name;
    private final Integer heartbeat;
    private final List<FeedConfig> feeds;

    public PointConfig(Integer id, String name, Integer heartbeat, List<FeedConfig> feeds) {
        this.id = id;
        this.name = name;
        this.heartbeat = heartbeat;
        this.feeds = feeds;
    }

    public Integer getId() { return id; }

    public String getName() { return name; }

    public Integer getHeartbeat() { return heartbeat; }

    public List<FeedConfig> getFeeds() { return feeds; }

    @Override
    public String toString() {
        return "PointConfig{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", heartbeat=" + heartbeat +
                ", feeds=" + feeds +
                '}';
    }
}
