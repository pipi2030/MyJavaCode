import cn.kgc.entity.Exam;
import cn.kgc.mapper.ExamMapper;
import cn.kgc.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMybatis {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-conf.xml");
        ExamMapper examMapper = (ExamMapper) context.getBean("examMapperImpl");
        int Grade18 = 0,Grade19 = 0,Grade20 = 0,Other = 0;
        for (Exam exam : examMapper.selectAllDemo()) {
            switch (exam.getsNo().toString().substring(0,2)){
                case "18":
                    Grade18 ++;
                    break;
                case "19":
                    Grade19++;
                    break;
                case "20":
                    Grade20++;
                    break;
                default:Other++;
            }
        }
        System.out.println(Grade18 + " " + Grade19 + " " + Grade20 + " " + Other);
    }
}
