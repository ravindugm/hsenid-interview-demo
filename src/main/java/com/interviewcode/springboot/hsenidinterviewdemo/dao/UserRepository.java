package com.interviewcode.springboot.hsenidinterviewdemo.dao;

import com.interviewcode.springboot.hsenidinterviewdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
