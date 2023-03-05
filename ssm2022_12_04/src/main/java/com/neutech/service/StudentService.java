package com.neutech.service;

import com.neutech.entity.Clazz;
import com.neutech.entity.Student;
import com.neutech.mapper.StudentMapper;

import java.util.List;

public interface StudentService {
    List<Student> list();
    int insert(Student student);
    int del(Integer id);
    Student getById(Integer id);
    int updateById(Student student);
}
