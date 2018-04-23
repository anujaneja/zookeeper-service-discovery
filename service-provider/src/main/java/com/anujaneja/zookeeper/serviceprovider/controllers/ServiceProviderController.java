package com.anujaneja.zookeeper.serviceprovider.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ServiceProviderController {

    @GetMapping("/helloWorld")
    public String helloWorld1(){

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();

        String url = request.getRequestURL().toString() + "?" + request.getQueryString();

        return "Welcome to service1 : "+ url;
    }
}
