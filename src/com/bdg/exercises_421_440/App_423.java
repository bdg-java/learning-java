package com.bdg.exercises_421_440;

public class App_423 {

    public static void main(String[] args) {
        int[][] matrix = TwoDimensionalArrays.getDefaultArray();
        int count = 0;
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i > j && matrix[i][j] % 5 == 0) {
                    sum += matrix[i][j];
                    count++;
                }

            }
        }
        if (count != 0) {
            System.out.println(sum / count);
        }

    }
}
