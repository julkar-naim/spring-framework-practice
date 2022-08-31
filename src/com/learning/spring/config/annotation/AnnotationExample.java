package com.learning.spring.config.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("com/learning/spring/config/annotation/annotationConfig.xml");

        Coach coach = context.getBean("CricketCoach", Coach.class);
        Coach tcoach = context.getBean("tennisCoach", Coach.class);

        coach.coachInfo();
        coach.showRoutine();

        tcoach.coachInfo();
        tcoach.showRoutine();

        Coach bcoach = context.getBean("baseballCoach", BaseballCoach.class);
        bcoach.coachInfo();
        bcoach.showRoutine();

        context.close();

    }
}
