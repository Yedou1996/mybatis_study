package com.lxl.dao;

import com.lxl.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
  //获取老师
  List<Teacher> getTeacher();

  //获取指定老师下的所有学生及老师的信息
  Teacher getTeacher2(@Param("id") int id);
}
