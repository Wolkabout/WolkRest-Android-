package com.wolkabout.wolkrestandroid.dto;

import com.wolkabout.wolkrestandroid.enumeration.UserRole;

import java.util.Date;

public class AuthenticationResponseDto {

    private final String email;
    private final UserRole role;
    private final String accessToken;
    private final Date accessTokenExpires;
    private final String refreshToken;
    private final Date refreshTokenExpires;

    public AuthenticationResponseDto(String email, UserRole role, String accessToken, Date accessTokenExpires, String refreshToken, Date refreshTokenExpires) {
        this.email = email;
        this.role = role;
        this.accessToken = accessToken;
        this.accessTokenExpires = accessTokenExpires;
        this.refreshToken = refreshToken;
        this.refreshTokenExpires = refreshTokenExpires;
    }

    public String getEmail() { return email; }

    public UserRole getRole() { return role; }

    public String getAccessToken() { return accessToken; }

    public Date getAccessTokenExpires() { return accessTokenExpires; }

    public String getRefreshToken() { return refreshToken; }

    public Date getRefreshTokenExpires() { return refreshTokenExpires; }

}
