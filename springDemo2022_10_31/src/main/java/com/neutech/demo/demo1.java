package com.neutech.demo;
import com.neutech.service.ProductService;
import com.neutech.service.impl.ProductServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo1 {
    public static void main(String[] args) {
        //方法一
//        ProductServiceImpl productService = new ProductServiceImpl();
//        productService.a();
        //方法二
        //St1 得到IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        //St2 用接口声明，用实现类分配空间
        ProductService productService1 = (ProductService) context.getBean("productServiceImpl");
        productService1.a();
        ProductService productService3 = (ProductService) context.getBean("productServiceImpl");
        System.out.println(productService1 == productService3);
    }
}
