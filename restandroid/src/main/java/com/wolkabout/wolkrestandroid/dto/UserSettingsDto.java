package com.wolkabout.wolkrestandroid.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserSettingsDto {

    private List<UserSettingDto> settings;

    public UserSettingsDto() {
    }

    public UserSettingsDto(List<UserSettingDto> settings) {
        this.settings = settings;
    }

    public List<UserSettingDto> getSettings() {
        return settings;
    }

    public void setSettings(List<UserSettingDto> settings) {
        this.settings = settings;
    }

    @Override
    public String toString() {
        return "UserSettingsDto{" +
                "settings=" + settings +
                '}';
    }
}
