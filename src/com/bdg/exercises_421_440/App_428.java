package com.bdg.exercises_421_440;

public class App_428 {
    public static void main(String[] args) {
        int[][] matrix = TwoDimensionalArrays.getDefaultArray();
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                if (matrix.length - 1 - i >= j && matrix[i][j] == 0) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
