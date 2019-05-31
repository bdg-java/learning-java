package com.bdg.Lesson_5;

public class App_430 {
    public static void main(String[] args) {

        int[][] matrix = {{ 5, 4, 31, 18},
                { 12, -5 , -6 , 11},
                { 23, 4, 56 ,14},
                { 10, 32, -9, 7}
        };
        int x = 0;
        double sum =0;

        for (int i =0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++)
                if (matrix[i][j] % 2 == 0) {
                    sum += matrix[i][j];
                    x++;
                }
        }
        System.out.println(sum/x);
    }
}
