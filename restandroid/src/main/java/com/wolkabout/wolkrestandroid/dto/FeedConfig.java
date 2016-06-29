package com.wolkabout.wolkrestandroid.dto;

public class FeedConfig {

    private final Integer id;
    private final String alarmHigh;
    private final Boolean alarmHighEnabled;
    private final String alarmLow;
    private final Boolean alarmLowEnabled;
    private final Boolean enabled;
    private final Boolean visible;

    public FeedConfig(Integer id, String alarmHigh, Boolean alarmHighEnabled, String alarmLow, Boolean alarmLowEnabled, Boolean enabled, Boolean visible) {
        this.id = id;
        this.alarmHigh = alarmHigh;
        this.alarmHighEnabled = alarmHighEnabled;
        this.alarmLow = alarmLow;
        this.alarmLowEnabled = alarmLowEnabled;
        this.enabled = enabled;
        this.visible = visible;
    }

    public Integer getId() { return id; }

    public String getAlarmHigh() { return alarmHigh; }

    public Boolean getAlarmHighEnabled() { return alarmHighEnabled; }

    public String getAlarmLow() { return alarmLow; }

    public Boolean getAlarmLowEnabled() { return alarmLowEnabled; }

    public Boolean getEnabled() { return enabled; }

    public Boolean getVisible() { return visible; }

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
