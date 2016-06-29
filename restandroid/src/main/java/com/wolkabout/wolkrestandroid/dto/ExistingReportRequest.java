package com.wolkabout.wolkrestandroid.dto;

import com.wolkabout.wolkrestandroid.enumeration.Range;

public class ExistingReportRequest {

    private final Integer reportId;
    private final Long from;
    private final Long to;
    private final Range range;

    public ExistingReportRequest(Integer reportId, Long from, Long to, Range range) {
        this.reportId = reportId;
        this.from = from;
        this.to = to;
        this.range = range;
    }

    public Integer getReportId() { return reportId; }

    public Long getFrom() { return from; }

    public Long getTo() { return to; }

    public Range getRange() { return range; }

}
