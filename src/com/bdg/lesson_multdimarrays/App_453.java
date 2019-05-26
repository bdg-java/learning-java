package com.bdg.lesson_multdimarrays;

public class App_453 {
    public static void main(String[] args) {
        int[][] array = MultDimArrays.getDefaultArray();
        int sum = 0;
        int a = 1;
        int b = 3;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j]>=a && array[i][j]<=b) {
                    sum +=array[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
