package com.wolkabout.wolkrestandroid.dto;

public class AggregatedReadingResponse {

    private final Long t;
    private final String a;
    private final String l;
    private final String h;

    public AggregatedReadingResponse(Long t, String a, String l, String h) {
        this.t = t;
        this.a = a;
        this.l = l;
        this.h = h;
    }

    public Long getT() { return t; }

    public String getA() { return a; }

    public String getL() { return l; }

    public String getH() { return h; }

}
