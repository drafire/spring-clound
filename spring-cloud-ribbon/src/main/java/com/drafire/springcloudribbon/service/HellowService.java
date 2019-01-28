package com.drafire.springcloudribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service
public class HellowService {
    @Autowired
    private RestTemplate restTemplate;

    //3秒钟的熔断时间
    @HystrixCommand(fallbackMethod = "helloError",commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",
                            value = "3000")
            })
    public String hello(String name) throws InterruptedException {
        int num = new Random().nextInt(6000);
        System.err.println("time sleep :"+num+" seconds");
        TimeUnit.MILLISECONDS.sleep(num);
        return restTemplate.getForObject("http://EUREKA-CLIENT/hellow?name=" + name, String.class);
    }

    //这个熔断的方法，必须和上面的hello 方法一直
    public String helloError(String name) {
        return "time out";
    }
}
