package com.wolkabout.wolkrestandroid.dto;

public class ChangePasswordRequest {

    private final String email;
    private final String oldPassword;
    private final String newPassword;

    public ChangePasswordRequest(String email, String oldPassword, String newPassword) {
        this.email = email;
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
    }

    public String getEmail() { return email; }

    public String getOldPassword() { return oldPassword; }

    public String getNewPassword() { return newPassword; }

}
