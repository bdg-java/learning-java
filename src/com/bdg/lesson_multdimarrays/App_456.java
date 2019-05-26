package com.bdg.lesson_multdimarrays;

public class App_456 {
    public static void main(String[] args) {
        int[][] array = MultDimArrays.getDefaultArray();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i][j]>=0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
