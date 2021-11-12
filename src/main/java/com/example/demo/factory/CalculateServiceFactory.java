package com.example.demo.factory;

import com.example.demo.service.CalculateService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import java.util.HashMap;
import java.util.Map;

public class CalculateServiceFactory implements ApplicationContextAware {

    public static Map<Integer, CalculateService> serviceMap = new HashMap<>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, CalculateService> beansOfType = applicationContext.getBeansOfType(CalculateService.class);
        beansOfType.keySet().forEach(e->serviceMap.put(beansOfType.get(e).getPriority(),beansOfType.get(e)));
    }
}
