package com.wolkabout.wolkrestandroid.dto;

public class CreatePointRequest {

    private final String serialNumber;
    private final String name;

    public CreatePointRequest(String serialNumber, String name) {
        this.serialNumber = serialNumber;
        this.name = name;
    }

    public String getSerialNumber() { return serialNumber; }

    public String getName() { return name; }

}
