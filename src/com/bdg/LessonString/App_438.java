package com.bdg.LessonString;

public class App_438 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 25},
                {50, 4, 6},
                {10, 25, 1},
        };
        int k = 3;
        int count = 0;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++)
            {

                if (i%2 == 1 || j%2 == 1) {
                    count++;
                  //  System.out.println(matrix[i][j]);
                }
            }
        }
        System.out.println(count);
    }
}
