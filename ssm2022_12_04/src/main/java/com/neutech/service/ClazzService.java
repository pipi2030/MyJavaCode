package com.neutech.service;

import com.neutech.entity.Clazz;
import com.neutech.entity.Student;

import java.util.List;

public interface ClazzService {
    List<Clazz> list();
    int delById(Integer id);
    int insert(Clazz clazz);
    Clazz selectById(Integer id);
    void updateById(Clazz clazz);
}
