package com.wolkabout.wolkrestandroid.dto;

public class AccessTokenDto {

    private String accessToken;

    public AccessTokenDto() {
    }

    public AccessTokenDto(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public String toString() {
        return "AccessTokenDto{" +
                "accessToken='" + accessToken + '\'' +
                '}';
    }
}
