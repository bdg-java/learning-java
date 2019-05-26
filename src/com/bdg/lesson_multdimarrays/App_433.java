package com.bdg.lesson_multdimarrays;

public class App_433 {
    public static void main(String[] args) {
        int[][] array = MultDimArrays.getDefaultArray();
        int count = 0;
        int a = 1;
        int b = 3;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i+j < array.length-1 && (array[i][j]>=a && array[i][j]<=b)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
