package com.terry.springclouds.hystrixfeign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceCustomerHystric implements SchedualServiceCustomer {

    @Override
    public String sayHiFromClientOne(String name) {
        return "Customer sorry " + name;
    }
}
