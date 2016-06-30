package com.wolkabout.wolkrestandroid.dto;

import com.wolkabout.wolkrestandroid.enumeration.UserRole;

import java.util.Date;

public class AuthenticationResponseDto {

    private String email;
    private UserRole role;
    private String accessToken;
    private Date accessTokenExpires;
    private String refreshToken;
    private Date refreshTokenExpires;

    public AuthenticationResponseDto() {
    }

    public AuthenticationResponseDto(String email, UserRole role, String accessToken, Date accessTokenExpires, String refreshToken, Date refreshTokenExpires) {
        this.email = email;
        this.role = role;
        this.accessToken = accessToken;
        this.accessTokenExpires = accessTokenExpires;
        this.refreshToken = refreshToken;
        this.refreshTokenExpires = refreshTokenExpires;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Date getAccessTokenExpires() {
        return accessTokenExpires;
    }

    public void setAccessTokenExpires(Date accessTokenExpires) {
        this.accessTokenExpires = accessTokenExpires;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Date getRefreshTokenExpires() {
        return refreshTokenExpires;
    }

    public void setRefreshTokenExpires(Date refreshTokenExpires) {
        this.refreshTokenExpires = refreshTokenExpires;
    }

    @Override
    public String toString() {
        return "AuthenticationResponseDto{" +
                "email='" + email + '\'' +
                ", role=" + role +
                ", accessToken='" + accessToken + '\'' +
                ", accessTokenExpires=" + accessTokenExpires +
                ", refreshToken='" + refreshToken + '\'' +
                ", refreshTokenExpires=" + refreshTokenExpires +
                '}';
    }
}
