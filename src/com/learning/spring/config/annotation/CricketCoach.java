package com.learning.spring.config.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("CricketCoach")
public class CricketCoach implements Coach{
    private Routine routine;

    @Autowired
    @Qualifier("morningRoutine")
    public void setRoutine(Routine routine) {
        this.routine = routine;
    }

    public void showRoutine() {
        System.out.println(routine.getRoutine());
    }

    @Override
    public void coachInfo() {
        System.out.println("I am a cricket coach");
    }
}
