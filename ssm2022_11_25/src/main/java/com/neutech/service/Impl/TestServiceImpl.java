package com.neutech.service.Impl;

import com.neutech.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public void a() {
        System.out.println(1);
    }
}
