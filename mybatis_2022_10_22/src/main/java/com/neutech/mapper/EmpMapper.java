package com.neutech.mapper;
import com.neutech.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    List<Emp> Demo();
    void insert();
    void delte();
    void update();
    Emp getEmpByEmpno(int empno);

    void insertValue(@Param("empno")int empno,
                     @Param("ename")String ename);
    List<Emp> selectBySalAndDeptno(@Param("sal") int minSal,
                                   @Param("deptno")int deptno);
    List<Emp> selectByMultiDeptno(int[]arr);
}
