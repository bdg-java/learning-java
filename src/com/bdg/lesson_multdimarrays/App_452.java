package com.bdg.lesson_multdimarrays;

public class App_452 {
    public static void main(String[] args) {
        int[][] array = MultDimArrays.getDefaultArray();
        int sum = 0;
        int count = 0;

        int sqr1 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == array.length - 1 && j == array.length - 1) {
                    sqr1 = (int) Math.pow(array[i][j], 2);
                    count++;
                }
            }
        }
        int sqr2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == 0 && j == 0) {
                    sqr2 = (int) Math.pow(array[i][j], 2);
                    count++;
                }
            }
        }
        System.out.println(sqr1 + sqr2);
    }
}
