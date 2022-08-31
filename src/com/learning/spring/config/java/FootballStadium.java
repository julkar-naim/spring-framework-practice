package com.learning.spring.config.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballStadium implements Stadium {
    private Ball ball;

    public FootballStadium(Ball ball) {
        this.ball = ball;
    }

    @Override
    public void whichStadium() {
        System.out.println("Football stadium");
    }

    @Override
    public void ballType() {
        System.out.println("Playing with a " + ball.info());
    }
}
