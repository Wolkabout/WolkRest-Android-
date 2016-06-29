package com.wolkabout.wolkrestandroid.dto;

import com.wolkabout.wolkrestandroid.enumeration.Range;

import java.util.List;

public class ReportDto {

    private final Integer id;
    private final String name;
    private final Range range;
    private final String settings;
    private final List<Integer> feeds;
    private final String readingType;

    public ReportDto(Integer id, String name, Range range, String settings, List<Integer> feeds, String readingType) {
        this.id = id;
        this.name = name;
        this.range = range;
        this.settings = settings;
        this.feeds = feeds;
        this.readingType = readingType;
    }

    public Integer getId() { return id; }

    public String getName() { return name; }

    public Range getRange() { return range; }

    public String getSettings() { return settings; }

    public List<Integer> getFeeds() { return feeds; }

    public String getReadingType() { return readingType; }

}
