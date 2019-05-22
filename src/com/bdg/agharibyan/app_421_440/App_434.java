package com.bdg.agharibyan.app_421_440;

public class App_434 {

    public static void main(String[] args) {

        double matrix[][] = {
                {0, 1, 2, 3, 4, 5},
                {9, 8, 7, 6, 5, 4},
                {1, 2, 3, 4, 0, -6.1},
                {9, 0, 1, 1, 3.2, -9.1},
                {-9, -6, -1, -1, -3.1, -8.2},
                {1.3, 1.8, 1.5, 9.3, 7.2, 5.8},
        };
        int n = 6;
        double gumar = 0;
        double a = 5.4;
        double b = 15.3;

        for(int i = n-1; i < n; i++){
            if (Math.abs(matrix[0][i]) >= a && Math.abs(matrix[0][i]) <= b){
                gumar += matrix[0][i];
            }
        }
        for(int i = n-2; i < n; i++){
            if (Math.abs(matrix[1][i]) >= a && Math.abs(matrix[1][i]) <= b){
                gumar += matrix[1][i];
            }
        }
        for(int i = n-3; i < n; i++){
            if (Math.abs(matrix[2][i]) >= a && Math.abs(matrix[2][i]) <= b){
                gumar += matrix[2][i];
            }
        }
        for(int i = n-4; i < n; i++){
            if (Math.abs(matrix[3][i]) >= a && Math.abs(matrix[3][i]) <= b){
                gumar += matrix[3][i];
            }
        }
        for(int i = n-5; i < n; i++){
            if (Math.abs(matrix[4][i]) >= a && Math.abs(matrix[4][i]) <= b){
                gumar += matrix[4][i];
            }
        }
        for(int i = n-6; i < n; i++){
            if (Math.abs(matrix[5][i]) >= a && Math.abs(matrix[5][i]) <= b){
                gumar += matrix[5][i];
            }
        }
        System.out.print((double)gumar);
    }
}
