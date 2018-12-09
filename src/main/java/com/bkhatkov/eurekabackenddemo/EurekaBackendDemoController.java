package com.bkhatkov.eurekabackenddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaBackendDemoController {

    @Autowired
    Environment environment;

    @GetMapping("/hello")
    public String hello() {
        return "I am BACKEND at port: " + environment.getProperty("server.port");
    }
}
