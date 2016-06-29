package com.wolkabout.wolkrestandroid.dto;

public class AccessTokenDto {

    private final String accessToken;

    public AccessTokenDto(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() { return accessToken; }

}
