package com.wolkabout.wolkrestandroid.dto;

import java.util.List;

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
