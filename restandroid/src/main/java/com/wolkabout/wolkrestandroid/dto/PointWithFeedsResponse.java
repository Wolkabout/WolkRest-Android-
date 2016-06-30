package com.wolkabout.wolkrestandroid.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wolkabout.wolkrestandroid.enumeration.DeviceState;

import java.util.List;

@JsonIgnoreProperties("actuators")
public class PointWithFeedsResponse {

    private String name;
    private int id;
    private int currentBatteryState;
    private long activationTimestamp;
    private String deviceSerial;
    private DeviceState deviceState;
    private int batteryState;
    private int heartbeat;
    private long lastReportTimestamp;
    private List<FeedResponse> feeds;
    private String owner;

    public PointWithFeedsResponse() {
    }

    public PointWithFeedsResponse(String name, int id, int currentBatteryState, long activationTimestamp, String deviceSerial, DeviceState deviceState, int batteryState, int heartbeat, long lastReportTimestamp, List<FeedResponse> feeds, String owner) {
        this.name = name;
        this.id = id;
        this.currentBatteryState = currentBatteryState;
        this.activationTimestamp = activationTimestamp;
        this.deviceSerial = deviceSerial;
        this.deviceState = deviceState;
        this.batteryState = batteryState;
        this.heartbeat = heartbeat;
        this.lastReportTimestamp = lastReportTimestamp;
        this.feeds = feeds;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrentBatteryState() {
        return currentBatteryState;
    }

    public void setCurrentBatteryState(int currentBatteryState) {
        this.currentBatteryState = currentBatteryState;
    }

    public long getActivationTimestamp() {
        return activationTimestamp;
    }

    public void setActivationTimestamp(long activationTimestamp) {
        this.activationTimestamp = activationTimestamp;
    }

    public String getDeviceSerial() {
        return deviceSerial;
    }

    public void setDeviceSerial(String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }

    public DeviceState getDeviceState() {
        return deviceState;
    }

    public void setDeviceState(DeviceState deviceState) {
        this.deviceState = deviceState;
    }

    public int getBatteryState() {
        return batteryState;
    }

    public void setBatteryState(int batteryState) {
        this.batteryState = batteryState;
    }

    public int getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(int heartbeat) {
        this.heartbeat = heartbeat;
    }

    public long getLastReportTimestamp() {
        return lastReportTimestamp;
    }

    public void setLastReportTimestamp(long lastReportTimestamp) {
        this.lastReportTimestamp = lastReportTimestamp;
    }

    public List<FeedResponse> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<FeedResponse> feeds) {
        this.feeds = feeds;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "PointWithFeedsResponse{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", currentBatteryState=" + currentBatteryState +
                ", activationTimestamp=" + activationTimestamp +
                ", deviceSerial='" + deviceSerial + '\'' +
                ", deviceState=" + deviceState +
                ", batteryState=" + batteryState +
                ", heartbeat=" + heartbeat +
                ", lastReportTimestamp=" + lastReportTimestamp +
                ", feeds=" + feeds +
                ", owner='" + owner + '\'' +
                '}';
    }
}
