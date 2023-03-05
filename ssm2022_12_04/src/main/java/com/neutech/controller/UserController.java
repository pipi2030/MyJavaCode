package com.neutech.controller;

import com.neutech.entity.User;
import com.neutech.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/loginPage")
    public String LoginPage()
    {
        return "u/login";
    }
    @PostMapping ("/login")
    public String Login(User user, HttpSession httpSession){
        //登陆验证
        User userData = userService.getAllByUserName(user.getUsername());
        if(userData == null){
            System.out.println("账号不存在，请注册");
            return "u/login";
        }
        if(!userData.getPassword().equals(user.getPassword())){
            System.out.println("密码不正确，请重新输入");
            return "u/login";
        }
        System.out.println("可以登陆");
        httpSession.setAttribute("user",userData);
        return "redirect:/student/list";
    }
    @GetMapping("/registerPage")
    public String registerPage(){
        return "u/register";
    }
    @PostMapping("/register")
    public String register(String username, String password,
                           MultipartFile headImage, HttpServletRequest request){
        //获取真实路径
        String realPath = request.getServletContext().getRealPath("/upload/");
        File realPathFile = new File(realPath);
        if(!realPathFile.exists()){
            realPathFile.mkdir();
        }
        //生成文件名（随机名+上传文件名称的后缀）
        String fileName = UUID.randomUUID().toString() +
                headImage.getOriginalFilename().substring(headImage.getOriginalFilename().lastIndexOf("."));
        try {
            headImage.transferTo(new File(realPath + fileName));
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setHeadImage("/upload/" + fileName);
            userService.register(user);
        }
        catch (IOException e){
            e.printStackTrace();
            return "redirect:/user/registerPage";
        }
        return "redirect:/user/loginPage";
    }
}
