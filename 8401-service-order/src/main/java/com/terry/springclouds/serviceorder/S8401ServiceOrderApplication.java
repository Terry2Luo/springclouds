package com.terry.springclouds.serviceorder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class S8401ServiceOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(S8401ServiceOrderApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/serviceOrder")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,The service order is from port:" + port;
    }
}
