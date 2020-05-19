package com.terry.springclouds.hystrixribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/serviceCustomer")
    public String customerService(@RequestParam String name) {
        return helloService.customerService( name );
    }

    @GetMapping(value = "/serviceOrder")
    public String orderService(@RequestParam String name) {
        return helloService.orderService( name );
    }
}
