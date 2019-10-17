package com.sample.nacos.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.nacos.spring.boot.model.User;
import com.sample.nacos.spring.boot.service.UserService;

@RestController("user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {this.userService = userService;}

    @GetMapping
    @ResponseBody
    public User get(@RequestParam int id) {
        return userService.findById(id);
    }
}