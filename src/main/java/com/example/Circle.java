package com.example;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }
    // TODO: Define attributes for the circle

    @Override
    public double area() {

        // TODO: Implement the method
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public double perimeter() {
        // TODO: Implement the method
        return 2*Math.PI*this.radius;
    }
}