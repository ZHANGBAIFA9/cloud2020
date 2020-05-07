package com.springcloud.controller;


import com.springcloud.entity.CommonResult;
import com.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Create By BF On 2020/4/21
 */
@RestController
@Slf4j
public class OrderController {
    public static final String PAYMENT_URL = "http://localhost:8001" ;

    @Resource
    private RestTemplate restTemplate ;
    //写请求
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create/",payment , CommonResult.class) ;
    }
    //读请求
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id ){
        log.info("----------------" + id);
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id , CommonResult.class) ;
    }
}
