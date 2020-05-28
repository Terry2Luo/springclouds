package com.terry.springclouds.s8751springadmincloudsadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class S8751SpringAdminCloudsAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(S8751SpringAdminCloudsAdminServerApplication.class, args);
    }

}
