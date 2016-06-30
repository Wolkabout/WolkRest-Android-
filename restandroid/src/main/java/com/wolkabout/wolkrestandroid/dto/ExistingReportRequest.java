package com.wolkabout.wolkrestandroid.dto;

import com.wolkabout.wolkrestandroid.enumeration.Range;

public class ExistingReportRequest {

    private int reportId;
    private Long from;
    private long to;
    private Range range;

    public ExistingReportRequest() {
    }

    public ExistingReportRequest(int reportId, Long from, long to, Range range) {
        this.reportId = reportId;
        this.from = from;
        this.to = to;
        this.range = range;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public long getTo() {
        return to;
    }

    public void setTo(long to) {
        this.to = to;
    }

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "ExistingReportRequest{" +
                "reportId=" + reportId +
                ", from=" + from +
                ", to=" + to +
                ", range=" + range +
                '}';
    }
}
