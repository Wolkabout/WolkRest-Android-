package com.wolkabout.wolkrestandroid.dto;

public class EmailVerificationRequest {

    private final String emailVerificationCode;

    public EmailVerificationRequest(String emailVerificationCode) {
        this.emailVerificationCode = emailVerificationCode;
    }

    public String getEmailVerificationCode() { return emailVerificationCode; }

}
