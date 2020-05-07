package com.springcloud.dao;

import com.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Create By BF On 2020/4/20
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment) ;
    public Payment getPaymentById(@Param("id") Long id) ;
}
