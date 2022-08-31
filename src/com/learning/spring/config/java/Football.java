package com.learning.spring.config.java;

import org.springframework.stereotype.Component;

@Component
public class Football implements Ball {
    @Override
    public String info() {
        return "Football";
    }
}
