package com.neutech.demo;

import com.neutech.service.ProductService;
import com.neutech.service.impl.ProductServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo1 {
    public static void main(String[] args) {
        //本项目只要是学习使用一下spring IOC
        //ST1.创建IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
//        System.out.println(context);

        //原来
        ProductService productService = new ProductServiceImpl();
        productService.a();

        //利用ioc容器
        ProductService productService1 = (ProductService) context.getBean("productService");
        productService1.a();
    }
}
