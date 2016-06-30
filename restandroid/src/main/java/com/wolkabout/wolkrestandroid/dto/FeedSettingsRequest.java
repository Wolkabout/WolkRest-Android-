package com.wolkabout.wolkrestandroid.dto;

import java.util.List;

public class FeedSettingsRequest {

    private List<FeedSetting> settings;

    public FeedSettingsRequest() {
    }

    public FeedSettingsRequest(List<FeedSetting> settings) {
        this.settings = settings;
    }

    public List<FeedSetting> getSettings() {
        return settings;
    }

    public void setSettings(List<FeedSetting> settings) {
        this.settings = settings;
    }

    @Override
    public String toString() {
        return "FeedSettingsRequest{" +
                "settings=" + settings +
                '}';
    }
}
