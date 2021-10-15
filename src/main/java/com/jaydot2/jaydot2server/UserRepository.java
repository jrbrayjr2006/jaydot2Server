package com.jaydot2.jaydot2server;

import java.io.Serializable;

/**
 * This is a temporary custom version of a repository interface
 */
public interface UserRepository {

    User save(User user);

    User findOne(Integer primaryKey);

    Iterable<User> findAll();
}
