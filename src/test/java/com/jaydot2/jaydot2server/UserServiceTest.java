package com.jaydot2.jaydot2server;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    UserService service;

    @BeforeEach
    void setUp() {
        service = new UserService();
    }
}