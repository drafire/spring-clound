package com.drafire.springcloudfeign.component;

import com.drafire.springcloudfeign.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class FallbackHystric implements HelloService {
    @Override
    public String hello(String name) {
        return "time out -" + name;
    }
}
