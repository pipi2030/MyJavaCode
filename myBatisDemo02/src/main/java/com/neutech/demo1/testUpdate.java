package com.neutech.demo1;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class testUpdate {
    public static void main(String[] args) {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(
                demo1.class.getClassLoader().getResourceAsStream("mybatis.xml")
        );
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        session.update("UserMapper.update");
        session.commit();
    }
}
