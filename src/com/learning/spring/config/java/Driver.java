package com.learning.spring.config.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StadiumConfig.class);
        Stadium stadium = context.getBean("footballStadium", Stadium.class);
        stadium.whichStadium();
        stadium.ballType();

        Stadium bstadium = context.getBean("baseballStadium", Stadium.class);
        bstadium.whichStadium();
        bstadium.ballType();

        CricketStadium cstadium = context.getBean("cricketStadium", CricketStadium.class);
        cstadium.whichStadium();
        cstadium.ballType();
        System.out.println("Cricket stadium location is " + cstadium.getLocation());
    }
}
