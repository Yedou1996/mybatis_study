package com.lxl.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class user implements Serializable {
    private int id;
    private String name;
    private String pwd;
}
