package com.wolkabout.wolkrestandroid.dto;

public class FeedConfig {

    private int id;
    private String alarmHigh;
    private boolean alarmHighEnabled;
    private String alarmLow;
    private boolean alarmLowEnabled;
    private boolean enabled;
    private boolean visible;

    public FeedConfig() {
    }

    public FeedConfig(int id, String alarmHigh, boolean alarmHighEnabled, String alarmLow, boolean alarmLowEnabled, boolean enabled, boolean visible) {
        this.id = id;
        this.alarmHigh = alarmHigh;
        this.alarmHighEnabled = alarmHighEnabled;
        this.alarmLow = alarmLow;
        this.alarmLowEnabled = alarmLowEnabled;
        this.enabled = enabled;
        this.visible = visible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "FeedConfig{" +
                "id=" + id +
                ", alarmHigh='" + alarmHigh + '\'' +
                ", alarmHighEnabled=" + alarmHighEnabled +
                ", alarmLow='" + alarmLow + '\'' +
                ", alarmLowEnabled=" + alarmLowEnabled +
                ", enabled=" + enabled +
                ", visible=" + visible +
                '}';
    }
}
