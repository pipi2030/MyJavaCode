package com.neutech.demo;
import com.neutech.entity.Emp;
import com.neutech.mapper.EmpMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class test {
    public static void main(String[] args) {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(
                test.class.getClassLoader().getResourceAsStream("mybatis.xml")
        );
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);

//        //testSelect
//        for (Emp emp : mapper.Demo()) {
//            System.out.println(emp);
//        }

//        //testInsert
//        mapper.insert();
//        session.commit();//增删改需要commit

//        //testDelete
//        mapper.delte();
//        session.commit();

//        //testUpdate
//        mapper.update();
//        session.commit();

//        //testGetEmpByEmpno 测试含一个变量传参
//        Emp empByEmpno = mapper.getEmpByEmpno(7902);
//        System.out.println(empByEmpno);

//        //testInsertValue 测试含多个变量传参 方法1
//        mapper.insertValue(7903,"你大爷");
//        session.commit();

//        //testselectBySalAndDeptno
//        for (Emp emp : mapper.selectBySalAndDeptno(6999,30)) {
//            System.out.println(emp);
//        }

        //testSelectByMultiDeptno
        for (Emp emp : mapper.selectByMultiDeptno(new int[]{10, 20})) {
            System.out.println(emp);
        }
    }
}
