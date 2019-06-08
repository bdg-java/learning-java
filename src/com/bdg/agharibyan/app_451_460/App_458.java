package com.bdg.agharibyan.app_451_460;

import java.util.Arrays;

public class App_458 {
    public static void main(String[] args) {

        int m = 5;
        int [][] matrix = new int [][]{
                { 1, 10, 100, 1000, -1000},
                { 10, 100, 1000, 1000, -1000},
                { 100, 1000, 10000, 1000, -1000},
                { 100, 100, 1000, 1000, -1000},
                { 10, 10, 100, 1000, -1000}
        };

        int k = 100;
        int qanak = 0;
        int [] b = new int [m];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < m; j++){
                if (Math.abs(matrix[i][j]) > k){
                    qanak ++;
                }
            }
            b[i] = qanak;
            qanak = 0;
        }
        System.out.print(Arrays.toString(b));
    }
}
