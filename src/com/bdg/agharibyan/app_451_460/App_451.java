package com.bdg.agharibyan.app_451_460;

import java.util.Arrays;

public class App_451 {
    public static void main (String []args) {

        int m = 5;
        int[][] matrix = new int[][]{
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 0}
        };
        double[] b = new double[m];

        for (int i = 0; i < m; i++){
            b [i] = (matrix[i][i] + matrix[i][m-1-i])/2;
        }
        System.out.print(Arrays.toString(b));

        // William jan, khndrum em asel, te inchu chem es verjin tarrs stanum 2.5, ayl stanum em 2.0
    }
}
