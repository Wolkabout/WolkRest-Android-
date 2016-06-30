package com.wolkabout.wolkrestandroid.dto;

public class AggregatedReadingResponse {

    private long t;
    private String a;
    private String l;
    private String h;

    public AggregatedReadingResponse() {
    }

    public AggregatedReadingResponse(long t, String a, String l, String h) {
        this.t = t;
        this.a = a;
        this.l = l;
        this.h = h;
    }

    public long getT() {
        return t;
    }

    public void setT(long t) {
        this.t = t;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "AggregatedReadingResponse{" +
                "t=" + t +
                ", a='" + a + '\'' +
                ", l='" + l + '\'' +
                ", h='" + h + '\'' +
                '}';
    }
}
