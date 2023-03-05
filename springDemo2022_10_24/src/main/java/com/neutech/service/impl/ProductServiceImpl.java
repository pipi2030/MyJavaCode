package com.neutech.service.impl;

import com.neutech.mapper.Impl.ProductMapperImpl;
import com.neutech.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    //尝试简单类型
    private int num;
    private String str;
    private BigDecimal dec;
    //尝试List类型
    private List<String> list;
    //尝试Set类型
    private Set<String> set;
    //尝试map类型
    private Map<Integer,String> map;
    //尝试其他类型
    @Autowired
    private ProductMapperImpl productMapper;

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }
    @Override
    public void a() {
//        System.out.println(num);
//        System.out.println(str);
//        System.out.println(dec);

//        for (String s : list) {
//            System.out.println(s);
//        }

//        for (String s : set) {
//            System.out.println(s);
//        }

//        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
//            System.out.print(integerStringEntry.getKey());
//            System.out.print(integerStringEntry.getValue());
//            System.out.println();
//        }

        System.out.println(productMapper);

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public BigDecimal getDec() {
        return dec;
    }

    public void setDec(BigDecimal dec) {
        this.dec = dec;
    }

    public ProductMapperImpl getProductMapper() {
        return productMapper;
    }

    public void setProductMapper(ProductMapperImpl productMapper) {
        this.productMapper = productMapper;
    }
}
