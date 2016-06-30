package com.wolkabout.wolkrestandroid.dto;

import com.wolkabout.wolkrestandroid.enumeration.AlarmState;
import com.wolkabout.wolkrestandroid.enumeration.Trend;

public class FeedResponse {

    private int id;
    private String readingType;
    private String currentValue;
    private AlarmState alarmState;
    private String alarmHigh;
    private boolean alarmHighEnabled;
    private String alarmLow;
    private boolean alarmLowEnabled;
    private Trend trend;
    private boolean enabled;
    private boolean visible;
    private int order;

    public FeedResponse() {
    }

    public FeedResponse(int id, String readingType, String currentValue, AlarmState alarmState, String alarmHigh, boolean alarmHighEnabled, String alarmLow, boolean alarmLowEnabled, Trend trend, boolean enabled, boolean visible, int order) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReadingType() {
        return readingType;
    }

    public void setReadingType(String readingType) {
        this.readingType = readingType;
    }

    public String getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    public AlarmState getAlarmState() {
        return alarmState;
    }

    public void setAlarmState(AlarmState alarmState) {
        this.alarmState = alarmState;
    }

    public String getAlarmHigh() {
        return alarmHigh;
    }

    public void setAlarmHigh(String alarmHigh) {
        this.alarmHigh = alarmHigh;
    }

    public boolean isAlarmHighEnabled() {
        return alarmHighEnabled;
    }

    public void setAlarmHighEnabled(boolean alarmHighEnabled) {
        this.alarmHighEnabled = alarmHighEnabled;
    }

    public String getAlarmLow() {
        return alarmLow;
    }

    public void setAlarmLow(String alarmLow) {
        this.alarmLow = alarmLow;
    }

    public boolean isAlarmLowEnabled() {
        return alarmLowEnabled;
    }

    public void setAlarmLowEnabled(boolean alarmLowEnabled) {
        this.alarmLowEnabled = alarmLowEnabled;
    }

    public Trend getTrend() {
        return trend;
    }

    public void setTrend(Trend trend) {
        this.trend = trend;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "FeedResponse{" +
                "id=" + id +
                ", readingType='" + readingType + '\'' +
                ", currentValue='" + currentValue + '\'' +
                ", alarmState=" + alarmState +
                ", alarmHigh='" + alarmHigh + '\'' +
                ", alarmHighEnabled=" + alarmHighEnabled +
                ", alarmLow='" + alarmLow + '\'' +
                ", alarmLowEnabled=" + alarmLowEnabled +
                ", trend=" + trend +
                ", enabled=" + enabled +
                ", visible=" + visible +
                ", order=" + order +
                '}';
    }
}
