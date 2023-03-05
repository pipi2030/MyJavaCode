package com.neutech.demo1;

import com.neutech.entity.Category;
import com.neutech.entity.Product;
import com.neutech.mapper.CategoryMapper;
import com.neutech.mapper.ProductMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.math.BigDecimal;

public class demo2 {
    public static void main(String[] args) {
        //创建sqlSession的工厂，传入配置文件的地址
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(
                testSelect02.class.getClassLoader().getResourceAsStream("mybatis.xml")
        );
        //创建SqlSession对象
        SqlSession session = factory.openSession();
//        ProductMapper mapper = session.getMapper(ProductMapper.class);
//        for (Product product : mapper.oneToOneDemo()) {
//            System.out.println(product);
//        }

//        CategoryMapper mapper = session.getMapper(CategoryMapper.class);
//        for (Category category : mapper.oneToManyDemo()) {
//            System.out.println(category);
//        }

//        ProductMapper mapper = session.getMapper(ProductMapper.class);
//        CategoryMapper mapper1 = session.getMapper(CategoryMapper.class);
//        for (Product product : mapper.selectFive()) {
//            Category category = mapper1.selectById(product.getCategoryId());
//            product.setCategory(category);
//            System.out.println(product);
//        }

//        ProductMapper mapper = session.getMapper(ProductMapper.class);
//        for (Product product : mapper.selectFive()) {
//            System.out.println(product.getCategoryId());
//        }

//        ProductMapper mapper = session.getMapper(ProductMapper.class);
//        Product product = new Product();
//        product.setPrice(new BigDecimal(2199.00));
////        product.setCategoryId(100012);
//        for (Product product1 : mapper.selectBYDynamic(product)) {
//            System.out.println(product1);
//        }
        ProductMapper mapper = session.getMapper(ProductMapper.class);
        mapper.del(new int[]{3});
        session.commit();
    }
}
