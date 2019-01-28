package com.drafire.springcloundeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloundEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloundEurekaClientApplication.class, args);
	}

}

