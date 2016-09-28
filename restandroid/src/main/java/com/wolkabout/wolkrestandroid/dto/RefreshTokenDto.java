package com.wolkabout.wolkrestandroid.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RefreshTokenDto {

    private String refreshToken;

    public RefreshTokenDto() {
    }

    public RefreshTokenDto(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    @Override
    public String toString() {
        return "RefreshTokenDto{" +
                "refreshToken='" + refreshToken + '\'' +
                '}';
    }
}
