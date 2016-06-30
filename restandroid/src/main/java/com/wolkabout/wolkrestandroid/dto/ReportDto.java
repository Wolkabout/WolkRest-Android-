package com.wolkabout.wolkrestandroid.dto;

import com.wolkabout.wolkrestandroid.enumeration.Range;

import java.util.List;

public class ReportDto {

    private int id;
    private String name;
    private Range range;
    private String settings;
    private List<Integer> feeds;
    private String readingType;

    public ReportDto() {
    }

    public ReportDto(int id, String name, Range range, String settings, List<Integer> feeds, String readingType) {
        this.id = id;
        this.name = name;
        this.range = range;
        this.settings = settings;
        this.feeds = feeds;
        this.readingType = readingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    public String getSettings() {
        return settings;
    }

    public void setSettings(String settings) {
        this.settings = settings;
    }

    public List<Integer> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<Integer> feeds) {
        this.feeds = feeds;
    }

    public String getReadingType() {
        return readingType;
    }

    public void setReadingType(String readingType) {
        this.readingType = readingType;
    }

    @Override
    public String toString() {
        return "ReportDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", range=" + range +
                ", settings='" + settings + '\'' +
                ", feeds=" + feeds +
                ", readingType='" + readingType + '\'' +
                '}';
    }
}
