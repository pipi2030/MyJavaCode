package com.neutech.service.ClazzServiceImpl;

import com.neutech.entity.Clazz;
import com.neutech.mapper.ClazzMapper;
import com.neutech.mapper.StudentMapper;
import com.neutech.service.ClazzService;
import com.neutech.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ClazzServiceImpl implements ClazzService {
    @Autowired
    private ClazzMapper clazzMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Clazz> list() {
        return clazzMapper.list();
    }
    @Transactional
    @Override
    public int delById(Integer id) {
        //先删学生，再删班级，并利用事务管理器
        studentMapper.delByClazzId(id);
        clazzMapper.delById(id);
        return clazzMapper.delById(id);
    }
    @Override
    public int insert(Clazz clazz) {
        return clazzMapper.insert(clazz);
    }

    @Override
    public Clazz selectById(Integer id) {
        return clazzMapper.selectById(id);
    }

    @Override
    public void updateById(Clazz clazz) {
        clazzMapper.updateById(clazz);
    }


}
