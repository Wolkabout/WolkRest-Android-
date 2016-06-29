package com.wolkabout.wolkrestandroid.dto;

import com.wolkabout.wolkrestandroid.enumeration.Range;

import java.util.List;

public class SnapshotReportRequest {

    private final String name;
    private final String settings;
    private final List<Integer> feeds;
    private final Long from;
    private final Long to;
    private final Range range;

    public SnapshotReportRequest(String name, String settings, List<Integer> feeds, Long from, Long to, Range range) {
        this.name = name;
        this.settings = settings;
        this.feeds = feeds;
        this.from = from;
        this.to = to;
        this.range = range;
    }

    public String getName() { return name; }

    public String getSettings() { return settings; }

    public List<Integer> getFeeds() { return feeds; }

    public Long getFrom() { return from; }

    public Long getTo() { return to; }

    public Range getRange() { return range; }

}
