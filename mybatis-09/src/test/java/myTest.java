import com.lxl.dao.userMapper;
import com.lxl.pojo.user;
import com.lxl.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class myTest {
    @Test
    public void getUser(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        user user = mapper.getUser(1);
        System.out.println(user);
        System.out.println("+++++++++++++++++++++++++++++");
        user user2 = mapper.getUser(1);
        System.out.println(user2);
        sqlSession.close();
    }
}
