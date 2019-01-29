package com.drafire.springcloudfeign.controller;

import com.drafire.springcloudfeign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService service;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {   //一定要指定这个@RequestParam ，否则可能会有一些意想不到的问题
        return service.hello(name);
    }
}
