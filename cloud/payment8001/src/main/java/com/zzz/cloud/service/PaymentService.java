package com.zzz.cloud.service;

import com.zzz.cloudapicommons.entity.Payment;

/**
 * @author zhangjiadong
 * @date 2020/8/21
 */
public interface PaymentService {
    int create(Payment payment);

    Payment  getPaymentById(Long id);
}
