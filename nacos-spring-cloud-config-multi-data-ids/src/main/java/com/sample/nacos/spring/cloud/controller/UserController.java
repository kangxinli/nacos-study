package com.sample.nacos.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.nacos.spring.cloud.model.User;
import com.sample.nacos.spring.cloud.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {this.userService = userService;}

    /**
     * http://localhost:8080/user?id=1
     */
    @GetMapping
    @ResponseBody
    public User get(@RequestParam long id) {
        return userService.findById(id);
    }

}