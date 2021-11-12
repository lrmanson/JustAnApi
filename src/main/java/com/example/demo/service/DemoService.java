package com.example.demo.service;

import com.example.demo.vo.DemoParam;

import java.math.BigDecimal;

public interface DemoService {

    BigDecimal calculateDeliveryCost(DemoParam demoParam);

    float calculateDiscount(DemoParam demoParam);
}
