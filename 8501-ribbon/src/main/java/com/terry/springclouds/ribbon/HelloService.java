package com.terry.springclouds.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    public String customerService(String name) {
        return restTemplate.getForObject("http://SERVICE-CUSTOMER/serviceCustomer?name="+name,String.class);
    }


    public String orderService(String name) {
        return restTemplate.getForObject("http://SERVICE-ORDER/serviceOrder?name="+name,String.class);
    }


}
