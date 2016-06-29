package com.wolkabout.wolkrestandroid.dto;

public class MessageWithNameDto {

    private final Integer id;
    private final String name;
    private final String content;
    private final Long timestamp;
    private final String collapseKey;
    private final String readingType;
    private final String details;

    public MessageWithNameDto(Integer id, String name, String content, Long timestamp, String collapseKey, String readingType, String details) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.timestamp = timestamp;
        this.collapseKey = collapseKey;
        this.readingType = readingType;
        this.details = details;
    }

    public Integer getId() { return id; }

    public String getName() { return name; }

    public String getContent() { return content; }

    public Long getTimestamp() { return timestamp; }

    public String getCollapseKey() { return collapseKey; }

    public String getReadingType() { return readingType; }

    public String getDetails() { return details; }

}
