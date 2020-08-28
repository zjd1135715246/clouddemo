package com.zzz.cloud.dao;

import com.zzz.cloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhangjiadong
 * @date 2020/8/21
 */
@Mapper
public interface PaymentDao {

     int create(Payment payment);

     Payment getPaymentById(Long id);
}
