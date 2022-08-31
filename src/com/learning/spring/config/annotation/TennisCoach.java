package com.learning.spring.config.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    private Routine routine;

    @Autowired
    public TennisCoach(@Qualifier("eveningRoutine") Routine routine) {
        this.routine = routine;
    }

    public void showRoutine() {
        System.out.println(this.routine.getRoutine());
    }

    @Override
    public void coachInfo() {
        System.out.println("I am a tennis coach");
    }
}
