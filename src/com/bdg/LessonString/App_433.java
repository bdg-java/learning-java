package com.bdg.LessonString;

public class App_433 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 25},
                {50, 4, 6},
                {10, 26, 1},
        };
        int a =1;
        int b =4;
        int sum =0;
        int cout = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                //   System.out.println(matrix[i][j]);
                if (matrix[i][j]>=a && matrix[i][j]<=b ) {
                  //  System.out.println(matrix[i][j]);
                    cout++;
                }
            }
        }
        System.out.println(cout);
    }
}
