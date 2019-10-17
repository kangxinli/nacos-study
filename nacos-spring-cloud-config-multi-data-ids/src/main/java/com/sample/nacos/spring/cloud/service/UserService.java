package com.sample.nacos.spring.cloud.service;

import org.springframework.stereotype.Service;

import com.sample.nacos.spring.cloud.model.User;

/**
 * @author hexu.hxy
 * @date 2019/1/7
 */

@Service
public interface UserService {

    User findById(Long id);

}