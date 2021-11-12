package com.example.demo.utils;

import com.example.demo.vo.DemoParam;

import java.math.BigDecimal;

public class CalculateUtil {

    public static BigDecimal calculateVolume(DemoParam demoParam){
        return demoParam.getWeight().multiply(demoParam.getLength()).multiply(demoParam.getHeight());
    }
}
