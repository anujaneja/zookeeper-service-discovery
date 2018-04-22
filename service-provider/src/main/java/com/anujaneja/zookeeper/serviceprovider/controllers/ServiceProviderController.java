package com.anujaneja.zookeeper.serviceprovider.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceProviderController {

    @GetMapping("/helloWorld")
    public String helloWorld1(){
        return "Hello World";
    }
}
