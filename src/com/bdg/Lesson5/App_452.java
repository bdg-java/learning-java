package com.bdg.Lesson5;

public class App_452 {
    public static void main(String[] args) {
        int m =0 ;
        int n = 0;
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
                if (k == len - 1 && i == len -1) {
                    m = matrix[i][k];
                }
                if(k == len - len && i == len - len){
                    n = matrix[i][k];
                }

            }
        }
        System.out.println(Math.pow(m,2) + " " +Math.pow(n,2));    }
}
