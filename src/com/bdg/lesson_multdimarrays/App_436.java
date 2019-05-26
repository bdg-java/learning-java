package com.bdg.lesson_multdimarrays;

public class App_436 {
    public static void main(String[] args) {
        int[][] array = MultDimArrays.getDefaultArray();
        int count = 0;
        int a = 3;
        int b = 8;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i+j > array.length-1 && (array[i][j]>=a && array[i][j]<=b)) {
                    count++;
                    sum+=array[i][j];
                }
            }
        }
        System.out.println((double)sum/count);

    }
}
