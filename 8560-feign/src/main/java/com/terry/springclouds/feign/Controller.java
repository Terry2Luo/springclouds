package com.terry.springclouds.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    SchedualServiceCustomer schedualServiceCustomer;

    @Autowired
    SchedualServiceOrder schedualServiceOrder;

    @GetMapping(value = "/serviceCustomer")
    public String sayServiceCustomer(@RequestParam String name) {
        return schedualServiceCustomer.sayHiFromClientOne( name );
    }

    @GetMapping(value = "/serviceOrder")
    public String sayServiceOrder(@RequestParam String name) {
        return schedualServiceOrder.sayHiFromClientOne( name );
    }
}
