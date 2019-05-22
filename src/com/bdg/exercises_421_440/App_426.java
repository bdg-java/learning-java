package com.bdg.exercises_421_440;

public class App_426 {

    public static void main(String[] args) {
        int[][] matrix = TwoDimensionalArrays.getDefaultArray();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                if (matrix.length - 1 - i > j && matrix[i][j] % 2 == 0) {
                    sum += matrix[i][j];
                }
            }

        }
        System.out.println(sum);

    }
}
