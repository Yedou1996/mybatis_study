import com.lxl.dao.blogMapper;
import com.lxl.pojo.Blog;
import com.lxl.utils.IdUtils;
import com.lxl.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


public class myTest {
    @Test
    public void addBlog(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        blogMapper mapper = sqlSession.getMapper(blogMapper.class);
        Blog blog = new Blog();
        blog.setId(IdUtils.getId());
        blog.setAuthor("娄大侠");
        blog.setCreatTime(new Date());
        blog.setTitle("java真厉害");
        blog.setViews(999);
        mapper.addBlog(blog);


        blog.setId(IdUtils.getId());
        blog.setCreatTime(new Date());
        blog.setTitle("mybatis真厉害");
        blog.setViews(999);
        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setCreatTime(new Date());
        blog.setTitle("spring真厉害");
        blog.setViews(999);
        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setCreatTime(new Date());
        blog.setTitle("娄小龙真厉害");
        blog.setViews(999);
        mapper.addBlog(blog);
        sqlSession.close();
    }
    @Test
    public  void queryBlogIf(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        blogMapper mapper = sqlSession.getMapper(blogMapper.class);
        HashMap map = new HashMap();
        map.put("title","java真厉害");
        //map.put("author","娄大侠");
        List<Blog> blogList = mapper.queryBlogIf(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public  void queryBlogChoose(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        blogMapper mapper = sqlSession.getMapper(blogMapper.class);
        HashMap map = new HashMap();
        map.put("title","java真厉害");
//        map.put("author","娄大侠");
        map.put("views",999);
        List<Blog> blogList = mapper.queryBlogChoose(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void queryBlogForeach(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        blogMapper mapper = sqlSession.getMapper(blogMapper.class);
        HashMap map = new HashMap();
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        map.put("ids",list);
        List<Blog> blogList = mapper.queryBlogForeach(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
