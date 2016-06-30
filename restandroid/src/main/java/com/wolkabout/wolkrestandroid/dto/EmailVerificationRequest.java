package com.wolkabout.wolkrestandroid.dto;

public class EmailVerificationRequest {

    private String emailVerificationCode;

    public EmailVerificationRequest() {
    }

    public EmailVerificationRequest(String emailVerificationCode) {
        this.emailVerificationCode = emailVerificationCode;
    }

    public String getEmailVerificationCode() {
        return emailVerificationCode;
    }

    public void setEmailVerificationCode(String emailVerificationCode) {
        this.emailVerificationCode = emailVerificationCode;
    }

    @Override
    public String toString() {
        return "EmailVerificationRequest{" +
                "emailVerificationCode='" + emailVerificationCode + '\'' +
                '}';
    }
}
