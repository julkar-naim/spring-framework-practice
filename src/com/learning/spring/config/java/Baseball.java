package com.learning.spring.config.java;

import org.springframework.stereotype.Component;

@Component
public class Baseball implements Ball{
    @Override
    public String info() {
        return "Baseball";
    }
}
