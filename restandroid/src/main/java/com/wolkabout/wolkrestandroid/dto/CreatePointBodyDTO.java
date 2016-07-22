package com.wolkabout.wolkrestandroid.dto;

public class CreatePointBodyDTO {

    private String name;
    private String local;
    private String things;

    public CreatePointBodyDTO() {
    }

    public CreatePointBodyDTO(String name, String local, String things) {
        this.name = name;
        this.local = local;
        this.things = things;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getThings() {
        return things;
    }

    public void setThings(String things) {
        this.things = things;
    }

    @Override
    public String toString() {
        return "CreatePointBodyDTO{" +
                "name='" + name + '\'' +
                ", local='" + local + '\'' +
                ", things='" + things + '\'' +
                '}';
    }
}
