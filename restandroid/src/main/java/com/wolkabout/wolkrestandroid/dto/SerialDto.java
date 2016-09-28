package com.wolkabout.wolkrestandroid.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SerialDto {

    private String serial;

    public SerialDto() {
    }

    public SerialDto(String serial) {
        this.serial = serial;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "SerialDto{" +
                "serial='" + serial + '\'' +
                '}';
    }
}
