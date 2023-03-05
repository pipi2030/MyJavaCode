package com.neutech.controller;

import com.neutech.entity.Clazz;
import com.neutech.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/clazz")
public class ClazzController {
    @Autowired
    private ClazzService clazzService;
    @GetMapping("/list")
    public String list(ModelMap modelMap){
        modelMap.put("clazz",clazzService.list());
        return "c/list";
    }
    @GetMapping("/del")
    public String del(Integer id){
        clazzService.delById(id);
        return "redirect:/clazz/list";
    }
    @GetMapping("/addPage")
    public String addPage(){
        return "c/add";
    }
    @PostMapping("/add")
    public String add(Clazz clazz){
        clazzService.insert(clazz);
        return "redirect:/clazz/list";
    }
    @GetMapping("/updatePage")
    public String updatePage(ModelMap modelMap,Integer id){
        modelMap.put("clazz",clazzService.selectById(id));
        return "c/update";
    }
    @PostMapping("/update")
    public String update(Clazz clazz){
        clazzService.updateById(clazz);
        return "redirect:/clazz/list";
    }
}
