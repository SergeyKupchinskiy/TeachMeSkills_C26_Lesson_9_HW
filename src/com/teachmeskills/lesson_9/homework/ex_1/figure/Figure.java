package com.teachmeskills.lesson_9.homework.ex_1.figure;

public abstract sealed class Figure permits Circle, Rectangle, Triangle {
    public abstract double calculateTheArea();
    public abstract double calculateThePerimeter();
}
