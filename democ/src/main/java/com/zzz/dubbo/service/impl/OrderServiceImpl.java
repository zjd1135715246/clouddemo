package com.zzz.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zzz.demop.service.TestService;
import com.zzz.dubbo.service.OrderService;
import org.springframework.stereotype.Component;

/**
 * @author zjd
 * @date 2020/8/7
 */
@Component
public class OrderServiceImpl implements OrderService {

    @Reference(version = "1.0.0")
    private TestService testService;

    @Override
    public void test() {
        String s = testService.hello("张三");
        System.out.println(s);
    }
}
