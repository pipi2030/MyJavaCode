package com.neutech.mapper;

import com.neutech.entity.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> list();
    int insert(Student student);
    int del(Integer id);
    Student getById(Integer id);
    int updateById(Student student);
    int delByClazzId(Integer clazzId);
}
