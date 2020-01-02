package com.lxl.dao;

import com.lxl.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
   List<User> getUer();

    @Select("select * from user where id= #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{password})")
    int addUser(User user);

    @Update("update user set name=#{name} where id=#{id}")
    int updateUser(@Param("id") int id,@Param("name") String name);

    @Delete("delete from user where id =#{id}")
    int deleteUser(@Param("id") int id);
}


