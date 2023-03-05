package com.neutech.service.impl;

import com.neutech.mapper.ProductMapper;
import com.neutech.mapper.impl.ProductMapperImpl;
import com.neutech.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapperImpl productMapperImpl;
    @Override
    public void a() {
        System.out.println(productMapperImpl);

    }

    public ProductMapperImpl getProductMapperImpl() {
        return productMapperImpl;
    }

    public void setProductMapperImpl(ProductMapperImpl productMapperImpl) {
        this.productMapperImpl = productMapperImpl;
    }
}
