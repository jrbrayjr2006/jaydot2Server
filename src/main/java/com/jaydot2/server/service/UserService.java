package com.jaydot2.server.service;

import com.jaydot2.server.model.User;
import com.jaydot2.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public User createUser(User user) {
        User userData = repository.save(user);
        return userData;
    }
}
