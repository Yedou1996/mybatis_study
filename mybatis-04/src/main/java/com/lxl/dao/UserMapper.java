package com.lxl.dao;

import com.lxl.pojo.User;

import java.util.List;
import java.util.Map;


public interface UserMapper {

    //根据id查询用户
    User getUserById(int id);
    //分页查询
    List<User> getUserByLimit(Map<String, Integer> map);
    List<User> getUserByRowBounds();

}


