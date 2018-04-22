package com.anujaneja.zookeeper.serviceconsumer.controllers;

import com.anujaneja.zookeeper.serviceconsumer.client.Service1ClientWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceConsumerController {

    @Autowired
    private Service1ClientWrapper service1ClientWrapper;

    @GetMapping("/call-service1")
    public String greeting() {
        return service1ClientWrapper.helloWorld();
    }

}
