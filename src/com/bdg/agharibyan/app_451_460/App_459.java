package com.bdg.agharibyan.app_451_460;

import java.util.Arrays;

public class App_459 {
    public static void main(String[] args) {

        int m = 5;
        int [][] matrix = new int [][]{
                { 2, 2, 2, 2, 2},
                { 2, 2, 2, 2, -2},
                { 2, 2, 2, -2, -2},
                { 2, 2, -2, -2, -2},
                { 2, -2, -2, -2, -2}
        };

        int x = 1;
        int [] b = new int [m];

        for (int i = 0; i < m; i++){
            for (int k = 0; k < m; k++){
                if (matrix[i][k] < 0){
                    x = x * matrix[i][k];
                }
            }
            b[i] = x;
            x = 1;
        }
        System.out.print(Arrays.toString(b));
    }
}
