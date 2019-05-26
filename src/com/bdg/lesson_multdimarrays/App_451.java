package com.bdg.lesson_multdimarrays;

public class App_451 {
    public static void main(String[] args) {
        int[][] array = MultDimArrays.getDefaultArray();
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i + j == array.length - 1 && i != j) {
                        sum += array[i][j];
                        count++;
                    }
             }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i==j) {
                    sum += array[i][j];
                    count++;
                }
            }
        }
        System.out.println((double)sum/count);
    }
}
