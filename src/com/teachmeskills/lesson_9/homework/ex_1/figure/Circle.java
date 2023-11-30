package com.teachmeskills.lesson_9.homework.ex_1.figure;

public final class Circle extends Figure{
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateThePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateTheArea() {
        return Math.PI * radius * radius;
    }
}
