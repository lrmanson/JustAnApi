package com.example.demo.service.impl;

import com.example.demo.dto.rpc.VoucherItem;
import com.example.demo.factory.CalculateServiceFactory;
import com.example.demo.rpc.DiscountFeign;
import com.example.demo.service.DemoService;
import com.example.demo.utils.CalculateUtil;
import com.example.demo.vo.DemoParam;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DiscountFeign discountFeign;

    @Override
    public BigDecimal calculateDeliveryCost(DemoParam demoParam) {
        if(demoParam.getWeight().compareTo(new BigDecimal("50")) > 0){
            return CalculateServiceFactory.serviceMap.get(0).calculate(demoParam);
        }else if(demoParam.getWeight().compareTo(new BigDecimal("10")) > 0){
            return CalculateServiceFactory.serviceMap.get(1).calculate(demoParam);
        }else if(CalculateUtil.calculateVolume(demoParam).compareTo(new BigDecimal("1500")) < 0){
            return CalculateServiceFactory.serviceMap.get(2).calculate(demoParam);
        }else if(CalculateUtil.calculateVolume(demoParam).compareTo(new BigDecimal("2500")) < 0){
            return CalculateServiceFactory.serviceMap.get(3).calculate(demoParam);
        }else{
            return CalculateServiceFactory.serviceMap.get(4).calculate(demoParam);
        }
    }

    @Override
    public float calculateDiscount(DemoParam demoParam) {
        VoucherItem discount = discountFeign.getDiscount(demoParam.getVoucherCode());
        if(null != discount){
            return discount.getDiscount();
        }
        return 0;
    }


}
