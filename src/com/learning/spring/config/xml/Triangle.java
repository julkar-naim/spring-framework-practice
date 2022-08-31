package com.learning.spring.config.xml;

import java.io.Serializable;

public class Triangle implements Shape, Serializable {
    private double height;
    private double base;

    @Override
    public void area() {
        System.out.println("The are of this triangle is: " + base * height);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
