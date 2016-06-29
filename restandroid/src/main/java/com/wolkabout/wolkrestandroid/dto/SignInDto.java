package com.wolkabout.wolkrestandroid.dto;

public class SignInDto {

    private final String email;
    private final String password;

    public SignInDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() { return email; }

    public String getPassword() { return password; }

}
