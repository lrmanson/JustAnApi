package com.example.demo.rpc;

import com.example.demo.dto.rpc.VoucherItem;
import feign.Headers;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "discountFeign",url="${discount.api.domain}")
public interface DiscountFeign {


	@Headers({"Content-Type: application/json", "Accept: application/json"})
	@RequestMapping(value="/voucher/{voucherCode}",method= RequestMethod.GET)
	VoucherItem getDiscount(@Param("voucherCode") String voucherCode);

}
