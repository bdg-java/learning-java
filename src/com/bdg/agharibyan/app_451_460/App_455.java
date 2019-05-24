package com.bdg.agharibyan.app_451_460;

import java.util.Arrays;

public class App_455 {

    public static void main(String[] args) {

        int m = 5;
        int[][] matrix = new int[][]{
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 0}
        };
        int [] b = new int [m];

        for (int i = 0; i < m; i++){
            b[i] = matrix[i][i] * matrix[i][m - 1 - i];
        }
        System.out.print(Arrays.toString(b));
    }
}
