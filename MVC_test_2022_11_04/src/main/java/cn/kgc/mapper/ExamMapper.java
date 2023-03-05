package cn.kgc.mapper;

import cn.kgc.entity.Exam;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ExamMapper {
    List<Exam> selectAllDemo();
    int delete();
    int insert();
}
