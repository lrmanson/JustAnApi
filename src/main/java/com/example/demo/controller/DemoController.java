package com.example.demo.controller;

import com.example.demo.dto.DemoResult;
import com.example.demo.service.DemoService;
import com.example.demo.vo.DemoParam;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/calculation")
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping("/calculateAll")
    public ResponseEntity<DemoResult> calculateAll(DemoParam param) {
        DemoResult demoResult = new DemoResult();
        demoResult.setDeliveryCost(demoService.calculateDeliveryCost(param));
        demoResult.setDiscount(demoService.calculateDiscount(param));
        return ResponseEntity.ok(demoResult);
    }
}
