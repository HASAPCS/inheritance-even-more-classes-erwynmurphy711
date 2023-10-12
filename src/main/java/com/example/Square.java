package com.example;

public class Square extends Shape {
    private int side;
   
    public Square(int side){
        this.side = side;
    }
    // TODO: Define attributes for the square

    @Override
    public double area() {
        // TODO: Implement the method
        return this.side*this.side;
    }

    @Override
    public double perimeter() {
        // TODO: Implement the method
        return this.side*4;
    }
}