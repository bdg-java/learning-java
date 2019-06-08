package com.bdg.agharibyan.app_451_460;

import java.util.Arrays;

public class App_457 {
    public static void main(String[] args) {

        int m = 5;
        int [][] matrix = new int [][]{
                { -1, 0, 3, -8, 8},
                { -7, 0, 5, -8, 8},
                { -1, 0, -5, -8, -8},
                { 2, 0, 0, 8, 8},
                { -1, 0, 4, -8, -8}
        };

        int [] b = new int [m];
        int gumar = 0;

        for (int i = 0; i < m; i++){
            for (int k = 0; k < m; k++){
                if (matrix[i][k]%2 != 0){
                    gumar += matrix[i][k];
                }
            }
            b[i] = gumar;
            gumar = 0;
        }
        System.out.print(Arrays.toString(b));
    }
}
