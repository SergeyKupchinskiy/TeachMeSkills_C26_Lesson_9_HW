package com.teachmeskills.lesson_9.homework.ex_1.figure;

public final class Rectangle extends Figure{
    public double side1;
    public double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateThePerimeter() {
        return 2 * (side1 + side2);
    }

    @Override
    public double calculateTheArea() {
        return side1 * side2;
    }
}
