package com.bdg.exercises_421_440;

public class App_435 {
    public static void main(String[] args) {
        double[][] matrix = TwoDimensionalArrays.getDefaultDoubleArray();
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                if (matrix.length - 1 - i > j && (int) matrix[i][j] % 5 == 0) {
                    count++;

                }
            }

        }
        System.out.println(count);

    }
}
