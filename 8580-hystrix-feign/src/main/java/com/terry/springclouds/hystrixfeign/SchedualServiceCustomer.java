package com.terry.springclouds.hystrixfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-customer", fallback = SchedualServiceCustomerHystric.class)
public interface SchedualServiceCustomer {

    @RequestMapping(value = "/serviceCustomer",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
