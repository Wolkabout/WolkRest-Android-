package com.wolkabout.wolkrestandroid.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReadingResponse {

    private long t;
    private String d;

    public ReadingResponse() {
    }

    public ReadingResponse(long t, String d) {
        this.t = t;
        this.d = d;
    }

    public long getT() {
        return t;
    }

    public void setT(long t) {
        this.t = t;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "ReadingResponse{" +
                "t=" + t +
                ", d='" + d + '\'' +
                '}';
    }
}
