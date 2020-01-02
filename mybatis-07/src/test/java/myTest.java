import com.lxl.dao.TeacherMapper;
import com.lxl.pojo.Teacher;
import com.lxl.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class myTest {
    @Test
    public void getTeacher(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        for (Teacher teacher : sqlSession.getMapper(TeacherMapper.class).getTeacher()) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }
    @Test
    public void getTeacher2(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher2(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
