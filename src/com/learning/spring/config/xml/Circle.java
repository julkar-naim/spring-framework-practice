package com.learning.spring.config.xml;

public class Circle implements Shape {
    private final double PI = 3.1416;
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of this circle is : " + PI * radius * radius);
    }
}
