package com.learning.spring.config.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/learning/spring/config/xml/applicationConfig.xml");

        Shape circle = context.getBean("circle", Shape.class);

        circle.area();

        Shape triangle = context.getBean("triangle", Shape.class);

        triangle.area();

        context.close();
    }
}
