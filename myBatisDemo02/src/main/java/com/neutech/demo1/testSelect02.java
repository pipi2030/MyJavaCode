package com.neutech.demo1;

import com.neutech.entity.User;
import com.neutech.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.util.List;
public class testSelect02 {
    public static void main(String[] args) throws Exception{
        //创建sqlSession的工厂，传入配置文件的地址
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(
               testSelect02.class.getClassLoader().getResourceAsStream("mybatis.xml")
        );
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User> userList = userMapper.listUser();
        for(User user:userList){
            System.out.println(user);
        }
        session.commit();
    }
}
