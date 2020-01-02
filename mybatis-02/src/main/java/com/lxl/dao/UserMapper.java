package com.lxl.dao;

import com.lxl.pojo.User;

import java.util.List;

//
public interface UserMapper {

    //查询全部用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
    //插入User
    int addUser(User user);
    //更新用户
    int updateUser(User user);
    //删除用户
    int deleteUser(int id);
}


