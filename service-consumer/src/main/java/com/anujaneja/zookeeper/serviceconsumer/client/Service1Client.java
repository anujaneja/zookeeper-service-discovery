package com.anujaneja.zookeeper.serviceconsumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "Service1")
public interface Service1Client {

    @RequestMapping(value = "/helloWorld",method = RequestMethod.GET)
    @ResponseBody
    String helloWorld();

}
