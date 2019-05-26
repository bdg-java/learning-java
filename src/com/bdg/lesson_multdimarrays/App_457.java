package com.bdg.lesson_multdimarrays;

public class App_457 {
    public static void main(String[] args) {
        int[][] array = MultDimArrays.getDefaultArray();
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i][j]%2!=0) {
                    sum+=array[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
