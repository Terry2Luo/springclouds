package com.terry.springclouds.s8721eurekaserverturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class S8721EurekaServerTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(S8721EurekaServerTurbineApplication.class, args);
    }

}
