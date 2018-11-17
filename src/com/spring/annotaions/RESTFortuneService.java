package com.spring.annotaions;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Hello from REST Fortune Service.";
    }
}
