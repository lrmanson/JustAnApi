package com.example.demo.vo;

import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;

@Data
public class DemoParam {

    /**
     * 重量
     */
    @NonNull
    private BigDecimal weight;

    /**
     * 长
     */
    @NonNull
    private BigDecimal length;

    /**
     * 宽
     */
    @NonNull
    private BigDecimal width;

    /**
     * 高
     */
    @NonNull
    private BigDecimal height;

    /**
     * 优惠码
     */
    @NonNull
    private String voucherCode;

}
