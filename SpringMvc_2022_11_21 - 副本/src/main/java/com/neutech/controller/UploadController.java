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
public class UploadController {
    @PostMapping("/testUpload")
    public String Upload(MultipartFile file, HttpServletRequest request) throws IOException {
        //St1.连接实际服务器地址
        String storePath = "Data";//在服务器路径下的存储文件的文件夹的名字
        String realPath = request.getServletContext().getRealPath(storePath);
        //St2.产生文件名
        String fileName = UUID.randomUUID().toString() + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf('.'));
        //St3.若服务器存储文件夹不存在，建立一个
        File file1 = new File(realPath);
        if(!file1.exists()) {
            file1.mkdir();
        }
        //St4.传输文件
        file.transferTo(file1);
        return "upload";
    }
}
