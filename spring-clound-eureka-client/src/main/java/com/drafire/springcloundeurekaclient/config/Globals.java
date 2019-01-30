package com.drafire.springcloundeurekaclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Globals {
    @Value("${db.url}")
    private String url;

    public String getUrl() {
        return url;
    }
}
