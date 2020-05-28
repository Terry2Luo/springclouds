package com.terry.springclouds.s8730springadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class S8730SpringAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(S8730SpringAdminApplication.class, args);
    }

}
