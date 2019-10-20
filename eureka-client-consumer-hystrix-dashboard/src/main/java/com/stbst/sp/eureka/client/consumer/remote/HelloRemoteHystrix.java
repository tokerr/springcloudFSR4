package com.stbst.sp.eureka.client.consumer.remote;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote{


    @Override
    public String hello(@RequestParam String name) {
        String str=this.getClass().getName()+"fallback:hello "+name+", 这条信息发送失败了！";
        System.out.println(str);
        return str;
    }
}
