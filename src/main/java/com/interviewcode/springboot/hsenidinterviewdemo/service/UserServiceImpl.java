package com.interviewcode.springboot.hsenidinterviewdemo.service;

import com.interviewcode.springboot.hsenidinterviewdemo.dao.UserRepository;
import com.interviewcode.springboot.hsenidinterviewdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository theUserRepository) {
        this.userRepository = theUserRepository;
    }

    @Override
    @Transactional
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public User findById(int theId) {
        Optional<User> results = userRepository.findById(theId);

        User theUser = null;

        if (results.isPresent()) {
            theUser = results.get();
        } else {
            throw new RuntimeException("Did not found User of Id: " + theId);
        }
        return theUser;
    }

    @Override
    @Transactional
    public void save(User theUser) {
        userRepository.save(theUser);
    }
}
