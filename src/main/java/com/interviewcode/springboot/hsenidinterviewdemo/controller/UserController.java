package com.interviewcode.springboot.hsenidinterviewdemo.controller;

import com.interviewcode.springboot.hsenidinterviewdemo.entity.Role;
import com.interviewcode.springboot.hsenidinterviewdemo.entity.User;
import com.interviewcode.springboot.hsenidinterviewdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService theUserService) {
        this.userService = theUserService;
    }

    @GetMapping("/list")
    public String listUsers(Model theModel) {
        List<User> theUsers = userService.findAll();

        theModel.addAttribute("users", theUsers);

        return "/list-users";
    }

    @GetMapping("/showAdminRegistrationForm")
    public String showAdminRegistrationForm(Model theModel) {

        User theAdmin = new User();

        theModel.addAttribute("admin", theAdmin);

        return "/admin-registration-form";
    }

    @PostMapping("/saveAdmin")
    public String saveAdmin(@ModelAttribute("admin") User theAdmin) {

        theAdmin.setRoles(Arrays.asList(new Role("ADMIN")));

        userService.save(theAdmin);

        return "redirect:/users/list";
    }
}
