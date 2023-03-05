package com.neutech.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/upload")
/**
 * 程序功能:实现客户端文件上传到Tomcat服务器里
 * 要求文件名不可重复
 */
public class UploadController {
    @RequestMapping ("/testUpload")
    public String upload(MultipartFile file, HttpServletRequest request) throws IOException {
        //St1.获取服务器Tomcat位置
        String realPath = request.getServletContext().getRealPath("UploadedData");
        System.out.println(realPath);
        //St2.若服务器文件夹下没有该文件，先创建一下这个放置文件的文件夹
        File storeFile = new File(realPath);
        if(!storeFile.exists()){
            storeFile.mkdir();
        }
        //St3.获取随机不重复文件名与上传文件的最终路径
        String fileName = UUID.randomUUID().toString() + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf('.'));
        String filePath = realPath + "\\" + fileName;
        //St4.上传文件
        file.transferTo(new File(filePath));
        return "TestUpload";
    }
}
