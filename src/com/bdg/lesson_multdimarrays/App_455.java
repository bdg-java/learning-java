package com.bdg.lesson_multdimarrays;

public class App_455 {
    public static void main(String[] args) {
        int[][] array = MultDimArrays.getDefaultArray();
        int product = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i + j == array.length - 1 && i != j) {
                    product *= array[i][j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i==j) {
                    product *= array[i][j];
                }
            }
        }
        System.out.println(product);
    }
}