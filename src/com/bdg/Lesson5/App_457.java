package com.bdg.Lesson5;

public class App_457 {
    public static void main(String[] args) {
        int sum = 0;
        int matrix[][] = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, 44, 45},
                {51, 52, 53, 54, 55},
        };
        int len = matrix.length ;

        for (int i = 0; i < len; i++) {
            for (int k = 0; k < len; k++) {
                if(matrix[i][k]%2 == 1 ){
                    sum += matrix[i][k];
                }
            }
        }
        System.out.println(sum);
    }
}
