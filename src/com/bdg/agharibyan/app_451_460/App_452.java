package com.bdg.agharibyan.app_451_460;

import java.util.Arrays;

public class App_452 {
    public static void main (String[]args){

        int m = 5;
        int [][] matrix = {
                { 1, 2, 3, 4, 5},
                { 1, 2, 3, 4, 5},
                { 1, 2, 3, 4, 3},
                { 0, 0, 5, 0, 0},
                { 7, 7, 7, 7, 7},
        };

        double [] b = new double [m];

        for (int i = 0; i < m; i++){
            b [i] = Math.pow(matrix [i][0],2) + Math.pow(matrix[i][m-1],2);
        }
        System.out.print(Arrays.toString(b));
    }
}
