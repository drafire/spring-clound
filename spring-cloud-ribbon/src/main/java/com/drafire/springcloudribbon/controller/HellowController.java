package com.drafire.springcloudribbon.controller;

import com.drafire.springcloudribbon.service.HellowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {
    @Autowired
    HellowService helloService;

    @RequestMapping(value = "/hellow")
    public String hi(@RequestParam String name) throws InterruptedException {
        return helloService.hello(name);
    }
}
