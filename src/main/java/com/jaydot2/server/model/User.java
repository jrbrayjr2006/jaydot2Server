package com.jaydot2.server.model;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    public String id;

    public String fullname;

    public String email;

    public User() {}

    public User(String fullname, String email) {
        this.fullname = fullname;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
