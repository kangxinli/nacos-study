package com.sample.nacos.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.nacos.spring.model.User;
import com.sample.nacos.spring.service.UserService;

@Controller("user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {this.userService = userService;}

    @RequestMapping
    @ResponseBody
    public User get(@RequestParam int id) {
        return userService.findById(id);
    }

}