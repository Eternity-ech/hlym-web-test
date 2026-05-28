package com.lzs.demo.pojo;

public class Add {
    private String xian;
    private String xiang;

    public Add(String xian, String xiang) {
        this.xian = xian;
        this.xiang = xiang;
    }

    public Add() {
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public String getXiang() {
        return xiang;
    }

    public void setXiang(String xiang) {
        this.xiang = xiang;
    }

    @Override
    public String toString() {
        return "Add [xian=" + xian + ", xiang=" + xiang + "]";
    }
}
