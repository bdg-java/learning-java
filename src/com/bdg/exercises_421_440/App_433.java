package com.bdg.exercises_421_440;

public class App_433 {
    public static void main(String[] args) {
        double[][] matrix = TwoDimensionalArrays.getDefaultDoubleArray();
        int count = 0;
        double a = 2.3;
        double b = 123;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                if (matrix.length - 1 - i < j && (matrix[i][j] >= a && matrix[i][j] <= b)) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
