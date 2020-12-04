package com.zzz.demop.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.zzz.demop.service.TestService;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0")
@Component
public class TestServiceImpl implements TestService {


    @Override
    public String hello(String name) {
        return "hello"+name;
    }
}
