package com.zzz.cloud.service.impl;

import com.zzz.cloud.dao.PaymentDao;
import com.zzz.cloud.entity.Payment;
import com.zzz.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangjiadong
 * @date 2020/8/21
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        int i = paymentDao.create(payment);
        return i;
    }

    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }



}
