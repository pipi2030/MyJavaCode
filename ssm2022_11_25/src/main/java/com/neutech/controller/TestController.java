package com.neutech.controller;

import com.neutech.service.Impl.TestServiceImpl;
import com.neutech.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping("/test")
    public String test(){
        return "/WEB-INF/pages/demo.jsp";
    }
}
