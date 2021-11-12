package com.example.demo.service.impl;

import com.example.demo.service.CalculateService;
import com.example.demo.vo.DemoParam;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class SecondCalculateServiceImpl extends CalculateService {

    @Override
    public int getPriority() {
        return 1;
    }

    public BigDecimal calculate(DemoParam demoParam) {
        return new BigDecimal(20).multiply(demoParam.getWeight());
    }
}
