package com.example;

public class Triangle extends Shape {
    private int side1;
    private int side2;
    private int side3;
    // TODO: Define attributes for the triangle
    public Triangle(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double area() {
        double s = (this.side1+this.side2+this.side3)/2;
        // TODO: Implement the method
        return Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
    }

    @Override
    public double perimeter() {
        // TODO: Implement the method
        return this.side1+this.side2+this.side3;
    }
}

// TODO: Implement similar classes for Circle and Square
