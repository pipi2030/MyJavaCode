package com.neutech.controller;

import com.neutech.entity.Student;
import com.neutech.service.ClazzService;
import com.neutech.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/list")
    public String list(ModelMap modelMap){
        modelMap.put("studentList",studentService.list());
        return "s/list";
    }
    @Autowired
    private ClazzService clazzService;
    @GetMapping("/addPage")
    public String addPage(ModelMap modelMap){
        //在这里绑定数据库班级信息
        modelMap.put("clazzList",clazzService.list());
        return "s/addPage";
    }
    @PostMapping("/add")
    //后台管理系统，添加数据到数据库，点击提交后重定向到列表页
    public String add(Student student){
        studentService.insert(student);
        return "redirect:/student/list";
    }
    @GetMapping("/del")
    //后台管理系统，根据序号删除学生数据
    public String del(Integer id){
        studentService.del(id);
        return "redirect:/student/list";
    }
    @GetMapping("/updatePage")
    public String updatePage(ModelMap modelMap,Integer id){
        //绑定数据库班级信息
        modelMap.put("clazzList",clazzService.list());
        modelMap.put("student",studentService.getById(id));
        return "s/updatePage";
    }
    @PostMapping("update")
    public String update(Student student){
        studentService.updateById(student);
        return "redirect:/student/list";
    }

}
