package com.wolkabout.wolkrestandroid.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatedPointDto {

    private String name;
    private String pointId;
    private String password;

    public CreatedPointDto() {
    }

    public CreatedPointDto(String name, String pointId, String password) {
        this.name = name;
        this.pointId = pointId;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPointId() {
        return pointId;
    }

    public void setPointId(String pointId) {
        this.pointId = pointId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CreatedPointDto{" +
                "name='" + name + '\'' +
                ", pointId='" + pointId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
