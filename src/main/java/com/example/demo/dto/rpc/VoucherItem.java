package com.example.demo.dto.rpc;

import lombok.Data;

@Data
public class VoucherItem {

    private String code;
    private float discount;
    private String expiry;

}
