package com.bdg.lesson_multdimarrays;

public class App_454 {
    public static void main(String[] args) {
        int[][] array = MultDimArrays.getDefaultArray();
        int product = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                product *= Math.pow(array[i][j], 2);
            }
        }
        System.out.println(product);
    }
}

