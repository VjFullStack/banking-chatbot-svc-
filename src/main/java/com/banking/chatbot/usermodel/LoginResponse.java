package com.banking.chatbot.usermodel;

public class LoginResponse {

    private String sessionId;

    public LoginResponse( String sessionId) {

        this.sessionId = sessionId;
    }


    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}

