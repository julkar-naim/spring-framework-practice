package com.learning.spring.config.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballStadium implements Stadium {
    @Autowired
    @Qualifier("baseball")
    private Ball ball;

    @Override
    public void whichStadium() {
        System.out.println("Baseball stadium");
    }

    @Override
    public void ballType() {
        System.out.println("Playing with a " + ball.info());
    }
}
