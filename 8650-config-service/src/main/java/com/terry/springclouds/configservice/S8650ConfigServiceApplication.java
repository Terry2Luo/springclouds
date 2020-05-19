package com.terry.springclouds.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class S8650ConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(S8650ConfigServiceApplication.class, args);
    }

}
