package com.neutech.demo1;

import com.neutech.entity.Emp;
import com.neutech.mapper.EmpMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class main {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
                main.class.getClassLoader().getResourceAsStream("mybatis.xml")
        );
        SqlSession session = sqlSessionFactory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        mapper.updateEnameByEmpno(1003,"^-^");
        Emp emp = mapper.selectAllByEmpno(7369);
        System.out.println(emp);
        session.commit();
    }
}
