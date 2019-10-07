package com.codegym.service;

import com.codegym.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findOne(Long id);

    User save(User user);

    List<User> save(List<User> users);

    boolean exists(Long id);

    List<User> findAll(List<Long> ids);

    long count();

    void delete(Long id);

    void delete(User user);

    void delete(List<User> users);

    void deleteAll();
}
