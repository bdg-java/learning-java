package com.bdg.agharibyan.app_451_460;

import java.util.Arrays;

public class App_453 {
    public static void main(String[] args) {

        int m = 5;
        int [][] matrix = {
                { 3, 2, 3, 4, 5},
                { 2, 3, 4, 5, 6},
                { 3, 4, 5, 6, 7},
                { 4, 5, 6, 7, 8},
                { 5, 6, 7, 8, 9},
        };

        int [] B = new int [m];
        int a = 3;
        int b = 4;

        for (int i = 0; i < m; i++){
            for (int k = 0; k < m; k++)
            if ( matrix [i][k] >= a && matrix [i][k] <= b){
                B [i] += matrix[i][k];
            }
        }
        System.out.print(Arrays.toString(B));
    }
}
