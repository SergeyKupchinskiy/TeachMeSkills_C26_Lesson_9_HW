package com.teachmeskills.lesson_9.homework.ex_1;

import com.teachmeskills.lesson_9.homework.ex_1.figure.Circle;
import com.teachmeskills.lesson_9.homework.ex_1.figure.Figure;
import com.teachmeskills.lesson_9.homework.ex_1.figure.Rectangle;
import com.teachmeskills.lesson_9.homework.ex_1.figure.Triangle;

public class Runner {

    public static void main(String[] args) {

        Figure[] fiveFigures = new Figure[5];
        fiveFigures[0] = new Circle(12);
        fiveFigures[1] = new Rectangle(3,7);
        fiveFigures[2] = new Triangle(3,4,5);
        fiveFigures[3] = new Circle(2);
        fiveFigures[4] = new Triangle(5,6,9);

        double sumOfPerimeters = 0;
        int i = 1;

        for (Figure array : fiveFigures){
            System.out.println("Perimeter of the given figure № " + i + " = " + array.calculateThePerimeter());
            System.out.println("Area of the given figure № " + i + " = " + array.calculateTheArea() +"\n");
            i++;
            sumOfPerimeters += array.calculateThePerimeter();
        }

        System.out.println("\nThe sum of the perimeters of all five given figures = " + sumOfPerimeters);
    }
}
