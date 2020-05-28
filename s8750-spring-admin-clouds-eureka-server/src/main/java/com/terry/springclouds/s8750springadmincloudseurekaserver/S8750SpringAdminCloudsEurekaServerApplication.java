package com.terry.springclouds.s8750springadmincloudseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class S8750SpringAdminCloudsEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(S8750SpringAdminCloudsEurekaServerApplication.class, args);
    }

}
