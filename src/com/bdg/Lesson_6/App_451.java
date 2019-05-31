package com.bdg.Lesson_6;

public class App_451 {
    public static void main(String[] args) {

        int[][] x = {{5, 6, 3, 8},
                {12, 5, 55, 6},
                {7, 35, 52, 2},
                {3, -5, 11, 8}};
        int m = 0;
        int n = 0;
        int count = 0;

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i == j) {
                    m += x[i][j];
                    count++;

                }
                if (j == x.length - i - 1) {
                    n += x[i][j];
                    count++;
                }
            }
        }
        System.out.println((double) (m + n) / count);
    }
}
