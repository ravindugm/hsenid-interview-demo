package com.interviewcode.springboot.hsenidinterviewdemo.dao;

import com.interviewcode.springboot.hsenidinterviewdemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
