package com.bdg.lesson_multdimarrays;

public class App_438 {
    public static void main(String[] args) {
        int[][] array = MultDimArrays.getDefaultArray();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i+j > array.length-1 && array[i][j]>0 && j%2==0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
