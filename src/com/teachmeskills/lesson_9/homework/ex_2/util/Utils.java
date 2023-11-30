package com.teachmeskills.lesson_9.homework.ex_2.util;

import java.util.Arrays;

public class Utils {

    public static void showArray(int[][] array) {
        System.out.println(Arrays.deepToString(array));
 }

    public static void matrixMultiplication(int[][] array1, int[][] array2) {
        int[][] array3 = new int[array1.length][array2[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                for (int k = 0; k < array2.length; k++) {
                    array3[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(array3));
    }
}