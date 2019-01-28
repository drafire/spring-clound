package com.drafire.springcloudribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HellowService {
    @Autowired
    private RestTemplate restTemplate;

    public String hello(String name){
        return restTemplate.getForObject("http://EUREKA-CLIENT/hellow?name="+name,String.class);
    }
}
