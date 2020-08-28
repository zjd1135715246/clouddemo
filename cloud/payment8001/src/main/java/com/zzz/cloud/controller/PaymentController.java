package com.zzz.cloud.controller;

import com.zzz.cloud.service.PaymentService;
import com.zzz.cloudapicommons.entity.CommonResult;
import com.zzz.cloudapicommons.entity.Payment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangjiadong
 * @date 2020/8/21
 */
@RestController
@RequestMapping("/pay")
@Api(tags= "支付API")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment")
    @ApiOperation(value = "创建", notes = "post")
    public CommonResult create(Payment payment){
        int i = paymentService.create(payment);
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(200);
        return commonResult;
    }

    @GetMapping("/payment")
    @ApiOperation(value = "获取", notes = "get")
    public CommonResult getById(Long id){
        Payment payment = paymentService.getPaymentById(id);
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(200);
        commonResult.setData(payment);
        return commonResult;
    }


}
