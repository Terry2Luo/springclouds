package com.terry.springclouds.hystrixfeign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceOrderHystric implements SchedualServiceOrder {

    @Override
    public String sayHiFromClientOne(String name) {
        return "Order sorry " + name;
    }
}
