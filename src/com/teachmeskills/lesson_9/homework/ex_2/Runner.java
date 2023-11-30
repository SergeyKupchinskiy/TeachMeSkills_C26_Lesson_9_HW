package com.teachmeskills.lesson_9.homework.ex_2;

import com.teachmeskills.lesson_9.homework.ex_2.util.Utils;

public class Runner {

    public static void main(String[] args) {

        int[][] array1 = new int[][] {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] array2 = new int[][] {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};

        System.out.println("Matrix № 1: ");
        Utils.showArray(array1);
        System.out.println(("\nMatrix №2: "));
        Utils.showArray(array2);
        System.out.println("\nThe result of multiplying these two matrices: ");
        Utils.matrixMultiplication(array1,array2);
    }
}
