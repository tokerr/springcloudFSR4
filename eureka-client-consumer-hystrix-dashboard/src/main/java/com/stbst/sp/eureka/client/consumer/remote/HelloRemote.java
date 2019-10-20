package com.stbst.sp.eureka.client.consumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {


    @RequestMapping("/hello")
    String hello(@RequestParam  String name);
}
