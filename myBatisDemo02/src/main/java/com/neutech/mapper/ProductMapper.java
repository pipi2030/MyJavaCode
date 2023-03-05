package com.neutech.mapper;

import com.neutech.entity.Product;

import java.util.List;

public interface ProductMapper {
    List<Product> selectFive();
    List<Product> oneToOneDemo();
    List<Product> selectBYDynamic(Product product);
    int del(int []arr);
}
