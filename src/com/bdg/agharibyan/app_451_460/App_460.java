package com.bdg.agharibyan.app_451_460;

import java.util.Arrays;

public class App_460 {

    public static void main(String[] args) {

        int m = 5;
        int [][] matrix = {
                { 3, 3, 3, 3, 3},
                { 2, 2, 3, 3, 3},
                { 2, 2, 2, 3, 3},
                { 2, 2, 2, 2, 3},
                { 2, 2, 2, 2, 2}
        };

        int [] b = new int [m];
        int x = 1;

        for (int i = 0; i < m; i++){
            for (int k = 0; k < m; k++){
                if (matrix[i][k]%2 == 0){
                    x = x * (int)Math.pow(matrix[i][k],2);
                }
            }
            b[i] = x;
            x = 1;
        }
        System.out.print(Arrays.toString(b));
    }
}
