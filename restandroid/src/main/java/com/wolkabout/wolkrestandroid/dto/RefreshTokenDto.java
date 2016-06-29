package com.wolkabout.wolkrestandroid.dto;

public class RefreshTokenDto {

    private final String refreshToken;

    public RefreshTokenDto(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getRefreshToken() { return refreshToken; }

}
