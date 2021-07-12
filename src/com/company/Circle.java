package com.company;

public class Circle {

    private float radius;
    private static float pi = (float)Math.PI;

    // float circumference = 2 * pi * radius; //calculation
    public Circle() {
    }

    public Circle(float radius, float pi) {
        this.radius = radius;
        this.pi = pi;
    }

    public float getRadius() {
        return this.radius;
    }

    public static void setRadius(float radius) {
        radius = radius;
    }

    public float getArea() {
        return pi * (float)Math.pow(this.radius, 2);
    }

    public float getCircumference() {
        return 2 * pi * this.radius;
    }

}
