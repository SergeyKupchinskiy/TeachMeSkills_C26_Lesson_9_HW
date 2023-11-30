package com.teachmeskills.lesson_9.homework.ex_1.figure;

public final class Triangle extends Figure{
    public double side1;
    public double side2;
    public double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateThePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculateTheArea() {
        double x = (side1 + side2 + side3) / 2;
        return Math.sqrt(x * (x - side1) * (x - side1) * (x - side1));
    }
}
