package com.terry.springclouds.hystrixfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-order", fallback = SchedualServiceOrderHystric.class)
public interface SchedualServiceOrder {

    @RequestMapping(value = "/serviceOrder",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
