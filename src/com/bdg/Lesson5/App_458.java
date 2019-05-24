package com.bdg.Lesson5;

public class App_458 {
    public static void main(String[] args) {
        int sum = 0;
        int k = 0;

        int matrix[][] = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, -55, 45},
                {51, 52, 53, 54, 55},
        };
        int len = matrix.length ;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(matrix[i][j] + k == matrix[i][j]-k ){
                    sum = matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
