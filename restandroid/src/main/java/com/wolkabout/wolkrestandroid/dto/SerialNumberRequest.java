package com.wolkabout.wolkrestandroid.dto;

public class SerialNumberRequest {

    private String serialNumber;

    public SerialNumberRequest() {
    }

    public SerialNumberRequest(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "SerialNumberRequest{" +
                "serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
