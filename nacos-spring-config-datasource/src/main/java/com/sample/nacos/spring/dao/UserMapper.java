package com.sample.nacos.spring.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sample.nacos.spring.model.User;

public interface UserMapper {

    @Select(value = "select id, name from user where id = #{id}")
    User findById(@Param("id") long id);
}