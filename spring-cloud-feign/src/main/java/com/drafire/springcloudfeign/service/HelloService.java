package com.drafire.springcloudfeign.service;

import com.drafire.springcloudfeign.component.FallbackHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(value = "eureka-client", fallback = FallbackHystric.class)
@FeignClient(value = "eureka-client")
public interface HelloService {

    @GetMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);     //如果url需要带参数，一定要指定@RequestParam(value = xxx)
}
