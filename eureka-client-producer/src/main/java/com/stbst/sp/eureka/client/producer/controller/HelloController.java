package com.stbst.sp.eureka.client.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {



    @RequestMapping("/hello")
    public Object hello(@RequestParam String name){

        String str="hello "+name+",这是第一条消息！";
        System.out.println(str);
        return str;
    }
}
