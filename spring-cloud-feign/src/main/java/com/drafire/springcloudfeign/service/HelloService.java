package com.drafire.springcloudfeign.service;

import com.drafire.springcloudfeign.component.FallbackHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "eureka-client", fallback = FallbackHystric.class)
//@FeignClient(value = "eureka-client")
public interface HelloService {

    @PostMapping(value = "/hellow")    //只能使用post请求
    String hello(String name);
}
