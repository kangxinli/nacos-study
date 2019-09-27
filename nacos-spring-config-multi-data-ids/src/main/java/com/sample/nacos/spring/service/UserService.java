package com.sample.nacos.spring.service;

import com.sample.nacos.spring.model.User;

/**
 * @author hexu.hxy
 * @date 2019/1/7
 */
public interface UserService {

    User findById(Long id);

}