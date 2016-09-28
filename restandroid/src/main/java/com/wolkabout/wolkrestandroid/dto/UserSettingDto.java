package com.wolkabout.wolkrestandroid.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserSettingDto {

    private int id;
    private String settingType;
    private String color;
    private String unit;

    public UserSettingDto() {
    }

    public UserSettingDto(int id, String settingType, String color, String unit) {
        this.id = id;
        this.settingType = settingType;
        this.color = color;
        this.unit = unit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSettingType() {
        return settingType;
    }

    public void setSettingType(String settingType) {
        this.settingType = settingType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "UserSettingDto{" +
                "id=" + id +
                ", settingType='" + settingType + '\'' +
                ", color='" + color + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}
