package com.bdg.Lesson5;

public class App_455 {
    public static void main(String[] args) {
        int m =1 ;
        int n = 1;
        int matrix[][] = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, 44, 45},
                {51, 52, 53, 54, 55},
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                if (k == i) {
                    m *= matrix[i][k];

                }
                if(k == matrix.length -i - 1){
                    n *= matrix[i][k];
                }
            }
        }
        System.out.println(m * n);




    }
}
