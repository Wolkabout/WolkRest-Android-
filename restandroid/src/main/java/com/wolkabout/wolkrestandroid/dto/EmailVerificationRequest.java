package com.wolkabout.wolkrestandroid.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
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
