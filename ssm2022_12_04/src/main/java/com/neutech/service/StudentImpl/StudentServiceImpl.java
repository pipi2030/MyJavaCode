package com.neutech.service.StudentImpl;

import com.neutech.entity.Clazz;
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

    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int del(Integer id) {
        return studentMapper.del(id);
    }

    @Override
    public Student getById(Integer id) {
        return studentMapper.getById(id);
    }

    @Override
    public int updateById(Student student) {
        return studentMapper.updateById(student);
    }
}
