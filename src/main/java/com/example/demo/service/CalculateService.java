package com.example.demo.service;

import com.example.demo.vo.DemoParam;
import java.math.BigDecimal;

public abstract class CalculateService {

    public abstract int getPriority();

    public abstract BigDecimal calculate(DemoParam demoParam);

}
