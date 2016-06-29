package com.wolkabout.wolkrestandroid.dto;

public class UserSettingDto {

    private final Integer id;
    private final String settingType;
    private final String color;
    private final String unit;

    public UserSettingDto(Integer id, String settingType, String color, String unit) {
        this.id = id;
        this.settingType = settingType;
        this.color = color;
        this.unit = unit;
    }

    public Integer getId() { return id; }

    public String getSettingType() { return settingType; }

    public String getColor() { return color; }

    public String getUnit() { return unit; }

}
