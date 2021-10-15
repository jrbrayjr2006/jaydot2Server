package com.jaydot2.jaydot2server;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@Slf4j
@RestController
public class ContactUsController {

    UserService userService;

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {

        return userService.save(user);
    }
}
