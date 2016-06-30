package com.wolkabout.wolkrestandroid.dto;

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
