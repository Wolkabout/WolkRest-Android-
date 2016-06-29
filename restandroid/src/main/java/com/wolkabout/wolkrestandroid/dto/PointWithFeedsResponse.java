package com.wolkabout.wolkrestandroid.dto;

import com.wolkabout.wolkrestandroid.enumeration.DeviceState;

import java.util.List;

public class PointWithFeedsResponse {

    private final String name;
    private final Integer id;
    private final Integer currentBatteryState;
    private final Long activationTimestamp;
    private final String deviceSerial;
    private final DeviceState deviceState;
    private final Integer batteryState;
    private final Integer heartbeat;
    private final Long lastReportTimestamp;
    private final List<FeedResponse> feeds;

    public PointWithFeedsResponse(String name, Integer id, Integer currentBatteryState, Long activationTimestamp, DeviceState deviceState, String deviceSerial, Integer batteryState, Integer heartbeat, Long lastReportTimestamp, List<FeedResponse> feeds) {
        this.name = name;
        this.id = id;
        this.currentBatteryState = currentBatteryState;
        this.activationTimestamp = activationTimestamp;
        this.deviceState = deviceState;
        this.deviceSerial = deviceSerial;
        this.batteryState = batteryState;
        this.heartbeat = heartbeat;
        this.lastReportTimestamp = lastReportTimestamp;
        this.feeds = feeds;
    }

    public String getName() { return name; }

    public Integer getId() { return id; }

    public Integer getCurrentBatteryState() { return currentBatteryState; }

    public Long getActivationTimestamp() { return activationTimestamp; }

    public DeviceState getDeviceState() { return deviceState; }

    public String getDeviceSerial() { return deviceSerial; }

    public Integer getBatteryState() { return batteryState; }

    public Integer getHeartbeat() { return heartbeat; }

    public Long getLastReportTimestamp() { return lastReportTimestamp; }

    public List<FeedResponse> getFeeds() { return feeds; }

}
