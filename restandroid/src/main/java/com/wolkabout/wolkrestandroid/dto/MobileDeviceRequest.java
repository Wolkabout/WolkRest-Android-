package com.wolkabout.wolkrestandroid.dto;

import com.wolkabout.wolkrestandroid.enumeration.MobileDeviceType;

public class MobileDeviceRequest {

    private final String deviceId;
    private final MobileDeviceType deviceType;

    public MobileDeviceRequest(String deviceId, MobileDeviceType deviceType) {
        this.deviceId = deviceId;
        this.deviceType = deviceType;
    }

    public String getDeviceId() { return deviceId; }

    public MobileDeviceType getDeviceType() { return deviceType; }

}
