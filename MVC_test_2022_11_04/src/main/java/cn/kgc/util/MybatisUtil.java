package cn.kgc.util;

import cn.kgc.mapper.ExamMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
    public static SqlSession getSqlSession(){
        //获取session
        SqlSessionFactory sessionFactory = null;
        SqlSession session = null;
        sessionFactory = new SqlSessionFactoryBuilder().build(
                MybatisUtil.class.getClassLoader().getResourceAsStream("mybatis-conf.xml")
        );
        session = sessionFactory.openSession();
        return session;
    }


}
