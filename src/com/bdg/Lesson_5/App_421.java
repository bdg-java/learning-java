package com.bdg.Lesson_5;

public class App_421 {
    public static void main(String[] args) {

        int[][] matrix = {{ 5, 4, 31, 18},
                          { 12, -5 , -6 , 11},
                          { 23, 4, 56 ,14},
                          { 10, 32, -9, 7}
            };
        int k = 2;
        int c = 0;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] % k == 0)
                    c++;
            }
        }
        System.out.println(c);
    }
}