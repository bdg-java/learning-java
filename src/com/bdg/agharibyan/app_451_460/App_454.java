package com.bdg.agharibyan.app_451_460;

import java.util.Arrays;

public class App_454 {
    public static void main(String[] args) {

        int m = 5;
        int [][] matrix = {
                { 1, 2, 3, 4, 5},
                { 2, 3, 4, 5, 6},
                { 3, 4, 5, 6, 7},
                { 4, 5, 6, 7, 8},
                { 5, 6, 7, 8, 9},
        };

        long [] b = new long [m];
        int x = 1;

        for (int i = 0; i < m; i++){
            for (int k = 0; k < m; k++){
                x = x * (int)Math.pow(matrix[i][k],2);
            }
            b [i] = x;
            x = 1;
        }
        System.out.print(Arrays.toString(b));
    }
}
