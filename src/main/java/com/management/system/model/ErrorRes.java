package com.management.system.model;

public class ErrorRes {
    public int status;
    public String message;

    public ErrorRes(String message) {
        this.message = message;
    }
}
