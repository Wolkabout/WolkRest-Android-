package com.wolkabout.wolkrestandroid.dto;

public class CountDto {

    private int count;

    public CountDto() {
    }

    public CountDto(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "CountDto{" +
                "count=" + count +
                '}';
    }
}
