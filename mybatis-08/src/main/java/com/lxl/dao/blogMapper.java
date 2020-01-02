package com.lxl.dao;

import com.lxl.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface blogMapper {
    int addBlog(Blog blog);

    List<Blog> queryBlogIf(Map map);

    List<Blog> queryBlogChoose(Map map);

    List<Blog> queryBlogForeach(Map map);
}
