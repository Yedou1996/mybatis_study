package com.lxl.pojo;

import lombok.Data;

import java.util.Date;


@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date creatTime;  //属性名跟字段名不一致
    private int views;
}
