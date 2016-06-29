package com.wolkabout.wolkrestandroid.dto;

import com.wolkabout.wolkrestandroid.enumeration.DeviceActivationStatus;

public class DeviceStatusResponse {

    private final DeviceActivationStatus activationStatus;

    public DeviceStatusResponse(DeviceActivationStatus activationStatus) {
        this.activationStatus = activationStatus;
    }

    public DeviceActivationStatus getActivationStatus() { return activationStatus; }

}
