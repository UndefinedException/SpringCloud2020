package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @auther zzyy
 * @create 2019-11-12 11:12
 */
@Component //必须加 //必须加 //必须加
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "/payment/hystrix/ok/{id} 失败";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "/payment/hystrix/timeout/{id} 失败";
    }
}