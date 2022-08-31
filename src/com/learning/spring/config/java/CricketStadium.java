package com.learning.spring.config.java;

import org.springframework.beans.factory.annotation.Value;

public class CricketStadium implements Stadium{
    private Ball ball;


    @Value("${cricket.location}")
    private String location;

    public String getLocation() {
        return location;
    }

    @Override
    public void whichStadium() {
        System.out.println("Cricket Stadium");
    }

    @Override
    public void ballType() {
        System.out.println("Playing with a " + ball.info());
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }
}
