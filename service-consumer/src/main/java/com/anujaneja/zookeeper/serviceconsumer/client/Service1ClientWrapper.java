package com.anujaneja.zookeeper.serviceconsumer.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class Service1ClientWrapper {

    @Autowired
    private Service1Client service1Client;



    public String helloWorld() {
        return service1Client.helloWorld();
    }


}
