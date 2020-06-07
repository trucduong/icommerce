package com.trucduong.rd.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceRegistrationAndDiscoveryClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistrationAndDiscoveryClientApplication.class, args);
    }
}

