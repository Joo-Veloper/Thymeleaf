package com.example.Thymeleaf.config;

import org.springframework.stereotype.Component;

@Component("testSpringBean")
public class TestSpringBean {
    public String test(String data){
        return "test" + data;
    }
}
