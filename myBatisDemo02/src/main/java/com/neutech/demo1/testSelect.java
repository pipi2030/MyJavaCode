package com.neutech.demo1;

import com.neutech.entity.User;
import com.neutech.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class testSelect {
    public static void main(String[] args) {
        //创建sqlSession的工厂，传入配置文件的地址
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(
                testSelect02.class.getClassLoader().getResourceAsStream("mybatis.xml")
        );
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.getUserByName("admin");
        System.out.println(user);
        session.commit();
    }
}
