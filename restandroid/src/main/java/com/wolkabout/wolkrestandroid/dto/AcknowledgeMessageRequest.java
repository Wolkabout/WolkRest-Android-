package com.wolkabout.wolkrestandroid.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AcknowledgeMessageRequest {

    private int id;

    public AcknowledgeMessageRequest() {
    }

    public AcknowledgeMessageRequest(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AcknowledgeMessageRequest{" +
                "id=" + id +
                '}';
    }
}
