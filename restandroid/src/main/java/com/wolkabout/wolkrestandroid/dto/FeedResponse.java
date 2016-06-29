package com.wolkabout.wolkrestandroid.dto;

import com.wolkabout.wolkrestandroid.enumeration.AlarmState;
import com.wolkabout.wolkrestandroid.enumeration.Trend;

public class FeedResponse {

    private final Integer id;
    private final String readingType;
    private final String currentValue;
    private final AlarmState alarmState;
    private final String alarmHigh;
    private final Boolean alarmHighEnabled;
    private final String alarmLow;
    private final Boolean alarmLowEnabled;
    private final Trend trend;
    private final Boolean enabled;
    private final Boolean visible;
    private final Integer order;

    public FeedResponse(Integer id, String readingType, String currentValue, AlarmState alarmState, String alarmHigh, Boolean alarmHighEnabled, String alarmLow, Boolean alarmLowEnabled, Trend trend, Boolean enabled, Boolean visible, Integer order) {
        this.id = id;
        this.readingType = readingType;
        this.currentValue = currentValue;
        this.alarmState = alarmState;
        this.alarmHigh = alarmHigh;
        this.alarmHighEnabled = alarmHighEnabled;
        this.alarmLow = alarmLow;
        this.alarmLowEnabled = alarmLowEnabled;
        this.trend = trend;
        this.enabled = enabled;
        this.visible = visible;
        this.order = order;
    }

    public Integer getId() { return id; }

    public String getReadingType() { return readingType; }

    public String getCurrentValue() { return currentValue; }

    public AlarmState getAlarmState() { return alarmState; }

    public String getAlarmHigh() { return alarmHigh; }

    public Boolean getAlarmHighEnabled() { return alarmHighEnabled; }

    public String getAlarmLow() { return alarmLow; }

    public Boolean getAlarmLowEnabled() { return alarmLowEnabled; }

    public Trend getTrend() { return trend; }

    public Boolean getEnabled() { return enabled; }

    public Boolean getVisible() { return visible; }

    public Integer getOrder() { return order; }


}
