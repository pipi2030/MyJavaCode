package com.neutech.demo1;

import com.neutech.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class testInsert {
    public static void main(String[] args) {
        //创建sqlSession的工厂，传入配置文件的地址
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(
                testInsert.class.getClassLoader().getResourceAsStream("mybatis.xml")
        );
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        userMapper.insert("3","2",3);
        session.commit();
    }
}
