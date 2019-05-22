package com.homework421_440;

import java.util.Random;

public class DualArrayManipulation {
    public static int[][] arr(int m) {
        int[][] newArr = new int[m][m];

        Random rand = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                newArr[i][j] = rand.nextInt(20);
            }
        }

        return newArr;
    }

    public static void arrayPrint(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
