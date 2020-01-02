package com.lxl.pojo;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;
    //多个学会生对应一个老师
    private Teacher teacher;
}
