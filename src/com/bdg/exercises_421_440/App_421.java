package com.bdg.exercises_421_440;

public class App_421 {
    public static void main(String[] args) {
        int[][] matrix = TwoDimensionalArrays.getDefaultArray();
        int count = 0;
        int k = 8;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i > j && matrix[i][j] % k == 0) {
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
