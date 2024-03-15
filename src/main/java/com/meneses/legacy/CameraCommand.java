package com.meneses.legacy;

public class CameraCommand {
    String token;
    int code;
    String information;
    String type;
    long fetchSize;
    long offset;

    public CameraCommand() {

    }

    public CameraCommand(String token, int code, String information, String type, long fetchSize, long offset) {
        this.token = token;
        this.code = code;
        this.information = information;
        this.type = type;
        this.fetchSize = fetchSize;
        this.offset = offset;
    }

    public CameraCommand(String token, int code, String information, String type, long fetchSize) {
        this.token = token;
        this.code = code;
        this.information = information;
        this.type = type;
        this.fetchSize = fetchSize;
    }

    public CameraCommand(String token, int code, String information, long fetchSize) {
        this.token = token;
        this.code = code;
        this.information = information;
        this.fetchSize = fetchSize;
    }

    public CameraCommand(String token, int code, String information, String type) {
        this.token = token;
        this.code = code;
        this.information = information;
        this.type = type;
    }

    public CameraCommand(String token, int code, String information) {
        this.token = token;
        this.code = code;
        this.information = information;
    }

    public CameraCommand(String token, int code) {
        this.token = token;
        this.code = code;
    }
}
