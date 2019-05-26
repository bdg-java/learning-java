package com.bdg.lesson_multdimarrays;

public class App_440 {
    public static void main(String[] args) {
        int[][] array = MultDimArrays.getDefaultArray();
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i+j < array.length-1 && (i+j)%2 == 0) {
                    sum+=array[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
