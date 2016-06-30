package com.wolkabout.wolkrestandroid.dto;

import com.wolkabout.wolkrestandroid.enumeration.DeviceActivationStatus;

public class DeviceStatusResponse {

    private DeviceActivationStatus activationStatus;

    public DeviceStatusResponse() {
    }

    public DeviceStatusResponse(DeviceActivationStatus activationStatus) {
        this.activationStatus = activationStatus;
    }

    public DeviceActivationStatus getActivationStatus() {
        return activationStatus;
    }

    public void setActivationStatus(DeviceActivationStatus activationStatus) {
        this.activationStatus = activationStatus;
    }

    @Override
    public String toString() {
        return "DeviceStatusResponse{" +
                "activationStatus=" + activationStatus +
                '}';
    }
}
