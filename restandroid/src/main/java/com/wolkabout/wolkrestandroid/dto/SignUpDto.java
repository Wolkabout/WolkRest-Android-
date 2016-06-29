package com.wolkabout.wolkrestandroid.dto;

public class SignUpDto {

    private final String email;
    private final String password;

    public SignUpDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() { return email; }

    public String getPassword() { return password; }

}
