package com.terry.springclouds.s8700eurekaserverdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class S8700EurekaServerDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(S8700EurekaServerDashboardApplication.class, args);
    }

}
