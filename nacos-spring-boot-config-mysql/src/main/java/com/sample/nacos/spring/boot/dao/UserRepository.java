package com.sample.nacos.spring.boot.dao;

import org.springframework.data.repository.CrudRepository;

import com.sample.nacos.spring.boot.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}