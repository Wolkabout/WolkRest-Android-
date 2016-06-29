package com.wolkabout.wolkrestandroid.dto;

public class ReadingResponse {

    private final Long t;
    private final String d;

    public ReadingResponse(Long t, String d) {
        this.t = t;
        this.d = d;
    }

    public Long getT() { return t; }

    public String getD() { return d; }

}
