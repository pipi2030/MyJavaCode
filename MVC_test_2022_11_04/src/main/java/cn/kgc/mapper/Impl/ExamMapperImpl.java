package cn.kgc.mapper.Impl;

import cn.kgc.mapper.ExamMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import cn.kgc.util.MybatisUtil;
@Repository
public class ExamMapperImpl {

    private SqlSession session = MybatisUtil.getSqlSession();
    @Autowired
    private ExamMapper examMapper = (ExamMapper) session.getMapper(ExamMapper.class);
}
