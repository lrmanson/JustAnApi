package com.example.demo.service.impl;

import com.example.demo.service.CalculateService;
import com.example.demo.utils.CalculateUtil;
import com.example.demo.vo.DemoParam;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ThirdCalculateServiceImpl extends CalculateService {

    @Override
    public int getPriority() {
        return 2;
    }

    public BigDecimal calculate(DemoParam demoParam) {
        return new BigDecimal("0.03").multiply(CalculateUtil.calculateVolume(demoParam));
    }
}
