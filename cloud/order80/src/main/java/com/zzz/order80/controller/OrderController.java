package com.zzz.order80.controller;

import com.zzz.cloudapicommons.entity.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangjiadong
 * @date 2020/8/24
 */
@RestController
public class OrderController {

    private String URL = "http://localhost:8001/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order/get")
    public CommonResult get(Integer id){
        return restTemplate.getForObject(URL+"pay/payment?id="+id,CommonResult.class);
    }
}
