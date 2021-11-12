package com.example.demo.service.impl;

import com.example.demo.service.CalculateService;
import com.example.demo.utils.CalculateUtil;
import com.example.demo.vo.DemoParam;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class FifthCalculateServiceImpl extends CalculateService {


    @Override
    public int getPriority() {
        return 4;
    }

    @Override
    public BigDecimal calculate(DemoParam demoParam) {
        return new BigDecimal("0.05").multiply(CalculateUtil.calculateVolume(demoParam));
    }
}
