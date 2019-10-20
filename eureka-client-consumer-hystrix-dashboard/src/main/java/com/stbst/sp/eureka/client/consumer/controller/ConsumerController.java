package com.stbst.sp.eureka.client.consumer.controller;

import com.stbst.sp.eureka.client.consumer.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloRemote helloRemote;


    @RequestMapping("/index/{name}")
    public String index(@PathVariable String name){
        String hello = helloRemote.hello(name);
        System.out.println("日志:"+hello);
        return hello;
    }
}
