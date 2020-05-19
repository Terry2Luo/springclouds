package com.terry.sprignclouds.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class S8201EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(S8201EurekaServerApplication.class, args);
    }


}
