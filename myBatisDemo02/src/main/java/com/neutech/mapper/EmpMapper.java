package com.neutech.mapper;

import com.neutech.entity.Emp;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    void insert(@Param("empno")int empno,
               @Param("ename")String ename);
    void deleteByEmpno(@Param("empno")int empno);
    void updateEnameByEmpno(@Param("empno")int empno,
                            @Param("ename")String ename);
    Emp selectAllByEmpno(@Param("empno")int empno);
}
