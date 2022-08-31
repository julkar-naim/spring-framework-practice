package com.learning.spring.config.annotation;

import org.springframework.stereotype.Component;

@Component
public class EveningRoutine implements Routine{

    @Override
    public String getRoutine() {
        return "Evening routine....";
    }
}
