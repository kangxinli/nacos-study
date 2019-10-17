package com.sample.nacos.spring.cloud.dao;

import org.springframework.data.repository.CrudRepository;

import com.sample.nacos.spring.cloud.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}