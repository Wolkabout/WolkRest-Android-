package com.wolkabout.wolkrestandroid.dto;

public class CreatePointBodyDTO {

    private String name;

    public CreatePointBodyDTO() {
    }

    public CreatePointBodyDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CreatePointBodyDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
