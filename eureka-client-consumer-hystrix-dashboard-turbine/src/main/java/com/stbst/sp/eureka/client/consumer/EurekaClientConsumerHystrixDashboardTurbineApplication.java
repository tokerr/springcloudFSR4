package com.stbst.sp.eureka.client.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableTurbine //包含了@EnableDiscoveryClient
@EnableHystrixDashboard
public class EurekaClientConsumerHystrixDashboardTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumerHystrixDashboardTurbineApplication.class,args);
    }
}
