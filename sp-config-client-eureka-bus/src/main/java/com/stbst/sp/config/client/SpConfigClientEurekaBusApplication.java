package com.stbst.sp.config.client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpConfigClientEurekaBusApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpConfigClientEurekaBusApplication.class,args);
    }
}
