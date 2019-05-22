package com.bdg.agharibyan.app_421_440;

public class App_433 {
    public static void main(String[] args) {

        double matrix[][] = {
                {0, 1, 2, 3, 4, 5},
                {9, 8, 7, 6, 5, 4},
                {1, 2, 3, 4, 0, -6.1},
                {9, 0, 1, 1, 3.2, -9.1},
                {-9, -6, -1, -1, -3.1, -8.2},
                {1.3, 1.8, 1.5, 9.3, 7.2, 5.68},
        };
        int n = 6;
        int qanak = 0;
        int a = -1;
        int b = 2;

        for (int i = 0; i < n-1; i++){
            if (matrix[0][i] >= a && matrix[0][i] <= b){
                qanak++;
            }
        }
        for (int i = 0; i < n-2; i++){
            if (matrix[1][i] >= a && matrix[1][i] <= b){
                qanak++;
            }
        }
        for (int i = 0; i < n-3; i++){
            if (matrix[2][i] >= a && matrix[2][i] <= b){
                qanak++;
            }
        }
        for (int i = 0; i < n-4; i++){
            if (matrix[3][i] >= a && matrix[3][i] <= b){
                qanak++;
            }
        }
        for (int i = 0; i < n-5; i++){
            if (matrix[4][i] >= a && matrix[4][i] <= b){
                qanak++;
            }
        }
        System.out.print(qanak);
    }
}
