package com.zzz.dubbo.controller;

import com.zzz.dubbo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjd
 * @date 2020/12/4
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/test")
    public void test(){
        orderService.test();
    }
}
