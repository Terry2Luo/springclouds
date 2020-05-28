package com.terry.springclouds.s8753springadmincloudseurekaclientuser2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
@EnableDiscoveryClient

public class S8753SpringAdminCloudsEurekaClientUser2Application {

    public static void main(String[] args) {
        SpringApplication.run(S8753SpringAdminCloudsEurekaClientUser2Application.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

}
