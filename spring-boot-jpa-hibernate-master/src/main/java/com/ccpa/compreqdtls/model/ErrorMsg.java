package com.ccpa.compreqdtls.model;

public class ErrorMsg {

    private String userMessage;
    private String devopsMessage;   //  optional

    public ErrorMsg(String userMessage, String devopsMessage) {
        this.userMessage = userMessage;
        this.devopsMessage = devopsMessage;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public String getDevopsMessage() {
        return devopsMessage;
    }
}
