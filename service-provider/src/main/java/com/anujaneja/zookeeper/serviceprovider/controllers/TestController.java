package com.anujaneja.zookeeper.serviceprovider.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/error")
    public String  test() {
        return "TEST1";
    }
}
