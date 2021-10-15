package com.jaydot2.jaydot2server;

import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

@Component
public class UserRepositoryImpl implements UserRepository{

    ConcurrentHashMap<Integer, User> users = new ConcurrentHashMap<>();

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User findOne(Integer primaryKey) {
        return null;
    }

    @Override
    public Iterable findAll() {
        return null;
    }
}
