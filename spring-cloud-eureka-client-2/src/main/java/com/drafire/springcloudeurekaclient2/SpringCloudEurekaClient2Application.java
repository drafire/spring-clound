package com.drafire.springcloudeurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloudEurekaClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClient2Application.class, args);
	}

    @GetMapping("/hellow")
    public String hellow(){
        System.out.println("i am from client-2");
        return "i am from client-2";
    }
}

