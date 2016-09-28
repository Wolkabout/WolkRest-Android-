package com.wolkabout.wolkrestandroid.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageWithNameDto {

    private int id;
    private String name;
    private String content;
    private long timestamp;
    private String collapseKey;
    private String readingType;
    private String details;

    public MessageWithNameDto() {
    }

    public MessageWithNameDto(int id, String name, String content, long timestamp, String collapseKey, String readingType, String details) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.timestamp = timestamp;
        this.collapseKey = collapseKey;
        this.readingType = readingType;
        this.details = details;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getCollapseKey() {
        return collapseKey;
    }

    public void setCollapseKey(String collapseKey) {
        this.collapseKey = collapseKey;
    }

    public String getReadingType() {
        return readingType;
    }

    public void setReadingType(String readingType) {
        this.readingType = readingType;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "MessageWithNameDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                ", collapseKey='" + collapseKey + '\'' +
                ", readingType='" + readingType + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
