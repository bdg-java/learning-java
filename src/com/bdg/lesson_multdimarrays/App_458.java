package com.bdg.lesson_multdimarrays;

public class App_458 {
    public static void main(String[] args) {
        int[][] array = MultDimArrays.getDefaultArray();
        int count = 0;
        int k = 7;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(Math.abs(array[i][j])>k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
