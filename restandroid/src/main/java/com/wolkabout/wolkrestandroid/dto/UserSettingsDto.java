package com.wolkabout.wolkrestandroid.dto;

import java.util.List;

public class UserSettingsDto {

    private final List<UserSettingDto> settings;

    public UserSettingsDto(List<UserSettingDto> settings) {
        this.settings = settings;
    }

    public List<UserSettingDto> getSettings() { return settings; }

}
