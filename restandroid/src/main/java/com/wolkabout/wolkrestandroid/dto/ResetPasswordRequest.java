package com.wolkabout.wolkrestandroid.dto;

public class ResetPasswordRequest {

    private final String email;

    public ResetPasswordRequest(String email) {
        this.email = email;
    }

    public String getEmail() { return email; }

}
