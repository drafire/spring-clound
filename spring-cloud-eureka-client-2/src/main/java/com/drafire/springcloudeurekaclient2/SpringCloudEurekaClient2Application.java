package com.drafire.springcloudeurekaclient2;

import com.drafire.springcloudeurekaclient2.config.Globals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloudEurekaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClient2Application.class, args);
    }

    @Autowired
    private Globals globals;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        System.out.println("i am from client-2->");
        return "i am from client-2，{}->" + name + "-url：" + globals.getUrl();
    }
}

