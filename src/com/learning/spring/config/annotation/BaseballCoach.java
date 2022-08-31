package com.learning.spring.config.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BaseballCoach implements Coach {
    @Autowired
    @Qualifier("morningRoutine")
    private Routine routine;

    @Override
    public void coachInfo() {
        System.out.println("Baseball coach");
    }

    @Override
    public void showRoutine() {
        System.out.println(routine.getRoutine());
    }

    @PostConstruct
    private void init() {
        System.out.println("Creating baseball coach");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Destroying baseball coach");
    }


}
