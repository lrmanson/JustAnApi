package com.example.demo.service.impl;

import com.example.demo.service.CalculateService;
import com.example.demo.utils.CalculateUtil;
import com.example.demo.vo.DemoParam;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ForthCalculateServiceImpl extends CalculateService {

    @Override
    public int getPriority() {
        return 3;
    }

    public BigDecimal calculate(DemoParam demoParam) {
        return new BigDecimal("0.04").multiply(CalculateUtil.calculateVolume(demoParam));
    }
}
