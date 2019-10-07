package com.codegym.service.impl;

import com.codegym.model.User;
import com.codegym.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private static List<User> users;

    static {
        users=new ArrayList<>();


    }




    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findOne(Long id) {
        return null;
    }

    @Override
    public User save(User user) {
        users.add(user);

        return user;
    }

    @Override
    public List<User> save(List<User> users) {
        return null;
    }

    @Override
    public boolean exists(Long id) {
        return false;
    }

    @Override
    public List<User> findAll(List<Long> ids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void delete(List<User> users) {

    }

    @Override
    public void deleteAll() {

    }
}
