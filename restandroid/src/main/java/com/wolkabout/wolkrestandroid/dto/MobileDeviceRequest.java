package com.wolkabout.wolkrestandroid.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wolkabout.wolkrestandroid.enumeration.MobileDeviceType;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MobileDeviceRequest {

    private String deviceId;
    private MobileDeviceType deviceType;

    public MobileDeviceRequest() {
    }

    public MobileDeviceRequest(String deviceId, MobileDeviceType deviceType) {
        this.deviceId = deviceId;
        this.deviceType = deviceType;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public MobileDeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(MobileDeviceType deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public String toString() {
        return "MobileDeviceRequest{" +
                "deviceId='" + deviceId + '\'' +
                ", deviceType=" + deviceType +
                '}';
    }
}
