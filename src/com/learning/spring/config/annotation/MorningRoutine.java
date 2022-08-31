package com.learning.spring.config.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MorningRoutine implements Routine {

    @Override
    public String getRoutine() {
        return "Morning routine....";
    }
}
