package com.stbst.sp.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {


    @Value("${foo}")
    private String foo;

    @RequestMapping("/hi")
    public Object getFoo(){

        return "foo="+foo;
    }
}
