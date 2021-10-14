package com.jaydot2.jaydot2server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ContactUsController {

    public ContactUsController() {}

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {

        return user;
    }
}
