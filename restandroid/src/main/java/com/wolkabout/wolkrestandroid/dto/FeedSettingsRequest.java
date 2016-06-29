package com.wolkabout.wolkrestandroid.dto;

import java.util.List;

public class FeedSettingsRequest {

    private final List<FeedSetting> settings;

    public FeedSettingsRequest(List<FeedSetting> settings) {
        this.settings = settings;
    }

    public List<FeedSetting> getSettings() { return settings; }

}
