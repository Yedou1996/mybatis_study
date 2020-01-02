package com.lxl.dao;

import com.lxl.pojo.User;

import java.util.List;
import java.util.Map;

//
public interface UserMapper {
    //模糊查询
    List<User> getUserLike(String value);
    //查询全部用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
    //插入User
    int addUser(User user);
    //万能map插入新用户
    int addUser2(Map<String,Object> map);
    //更新用户
    int updateUser(User user);
    //万能map更新用户
    int updateUser2(Map<String,Object> map);
    //删除用户
    int deleteUser(int id);
}


