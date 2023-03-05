package com.neutech.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Value("${spring.datasource.url}")
    private String url;
    @GetMapping("/hello")
    public String hello(){
        System.out.println(url);
        return "Hello SpringBoot!";
    }
}
