package com.bdg.lesson_MultidimensionalArrays;

public class App_424 {
    public static void main(String[] args) {
        int[][] array = TwoDimArrays.getDefaultArray();
        int count = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i >= j && array[i][j] % 2 != 0) {
                    sum +=array[i][j];
                    count++;
                }
            }
        }
        System.out.println((double)sum/count);

    }
}
