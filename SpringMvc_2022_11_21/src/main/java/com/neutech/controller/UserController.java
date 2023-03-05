package com.neutech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @RequestMapping("/")
    public String Test(User user, @RequestHeader("User-Agent") String userAgent){
//        //尝试转发与重定向
//        System.out.println("请求被执行了");
//        System.out.println(user.getSname());
//        System.out.println(userAgent);

        /*
            默认转发 相当于forward:/WEB-INF/pages/product/test.jsp
            也可以重定向 redirect:https://www.baidu.com
            可以在mvc.xml里配置自己的前后缀
         */
        return "product/test";
    }
    @RequestMapping("/he")
    public String hello(ModelMap modelMap, HttpSession httpSession ){
        //把参数放到request里面
        modelMap.put("age","22");
        modelMap.put("number","2030200233");
        modelMap.put("sex","男");
        //把参数放到session里
        httpSession.setAttribute("name","xuyan");
        System.out.println(httpSession.getAttribute("name"));
        return "product/test";
    }
    @RequestMapping("/tt")
    @ResponseBody
    public User TestJson(){
        //测试通过请求得到json格式的数据
        User user = new User();
        user.setId(1);
        user.setSex("男");
        user.setSname("xuyang");
        return user;
    }
    @RequestMapping("/testJsonParam")
    @ResponseBody
    public User TestJsonParam(@RequestBody User user){
        System.out.println(user);
        return user;
    }
}
