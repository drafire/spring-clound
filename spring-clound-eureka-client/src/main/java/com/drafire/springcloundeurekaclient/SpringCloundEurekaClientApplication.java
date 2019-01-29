package com.drafire.springcloundeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloundEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloundEurekaClientApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {   //这些最好指定@RequestParam、或者@RequestParam(value="xxx")
        System.out.println("i am from client-1");
        return "i am from client-1，{}->" + name;
    }
}

