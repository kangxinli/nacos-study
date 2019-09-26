package com.sample.nacos.spring.service;

import org.springframework.stereotype.Service;

import com.sample.nacos.spring.model.User;

@Service
public interface UserService {

    User findById(Integer id);
}