package com.neutech.mapper;

import com.neutech.entity.Category;
import com.neutech.entity.Product;

import java.util.List;

public interface CategoryMapper {
    List<Category> oneToManyDemo();
    Category selectById(int id);
}
