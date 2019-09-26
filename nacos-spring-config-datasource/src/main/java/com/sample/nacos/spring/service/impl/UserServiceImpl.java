package com.sample.nacos.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.nacos.spring.dao.UserMapper;
import com.sample.nacos.spring.model.User;
import com.sample.nacos.spring.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {this.userMapper = userMapper;}

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}