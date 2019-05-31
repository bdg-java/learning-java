package com.bdg.Lesson_6;

import java.util.Arrays;

public class App_453 {
    public static void main(String[] args) {
        int[][] x = {{5, 6, 3, 8},
                {12, 5, 55, 6},
                {7, 35, 52, 2},
                {3, -5, 11, 8}};
        int a = 10;
        int b = 20;
        int c = 0;

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (x [i][j] >= a && x[i][j]<= b){
                    System.out.println(x[i][j]);
                    c += x[i][j];
                }
            }

        }
        System.out.println(Arrays.toString(x));
    }
}
