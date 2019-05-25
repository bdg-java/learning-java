package com.bdg.lesson_MultidimensionalArrays;

public class App_433 {
    public static void main(String[] args) {
        int[][] array = TwoDimArrays.getDefaultArray();
        int count = 0;
        int a = 4;
        int b = 5;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i <= j && (array[i][j]>=a && array[i][j]<=b)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
