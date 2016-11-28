package com.jaydot2.server.model;

/**
 * Created by jamesbray on 11/27/16.
 */
public class ContactMessage {

    private String email = "";
    private String message = "";

    public ContactMessage(){}

    public ContactMessage(String email, String message) {
        this.email = email;
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
