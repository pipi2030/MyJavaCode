package com.neutech.service.Impl;

import com.neutech.entity.Student;
import com.neutech.mapper.StudentMapper;
import com.neutech.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> list() {
        return studentMapper.list();
    }
}
