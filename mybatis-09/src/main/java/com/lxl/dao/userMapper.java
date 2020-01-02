package com.lxl.dao;

import com.lxl.pojo.user;
import org.apache.ibatis.annotations.Param;

public interface userMapper {
    user getUser(@Param("id") int id);
}
