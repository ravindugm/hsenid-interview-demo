package com.interviewcode.springboot.hsenidinterviewdemo.service;

import com.interviewcode.springboot.hsenidinterviewdemo.entity.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public User findById(int theId);

    public void save(User theUser);

}
