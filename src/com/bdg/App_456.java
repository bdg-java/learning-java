package com.bdg;

import java.util.Arrays;

public class App_456 {

    public static void main(String[] args) {

        int matrix[][] = new int[][]{

                {1, 2, -3, 4, -3},
                {1, -1, 3, 4, 5},
                {1, -1, 3, -5, 5},
                {1, 2, 3, -2, 5},
                {5, -5, 3, 0, 1}};
        int m = 5;
        int qount = 0;
        double[] b = new double[m];

        for (int i = 0; i < 0; i++) {
            for (int j = 0; j < m; j++) {

                if (matrix[i][j] > 0) {
                    qount++;

                }
            }
                    b[i] += qount;

                    System.out.println(qount);


                }
            }
        }


