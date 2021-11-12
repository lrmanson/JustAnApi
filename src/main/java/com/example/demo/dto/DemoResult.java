package com.example.demo.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DemoResult {

    /**
     * 运费金额
     */
    private BigDecimal deliveryCost;

    /**
     * 折扣金额
     */
    private float discount;

}
