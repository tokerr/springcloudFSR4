package com.stbst.sp.eureka.client.producer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
public class EurekaClientProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProducerApplication.class,args);
    }
}
