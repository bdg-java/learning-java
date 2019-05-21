package com.bdg.agharibyan.app_421_440;

public class App_429 {
    public static void main(String[] args) {

        int matrix[][] = {
                {0, 1, 2, 3, 4},
                {91, 82, 73, 64, 55},
                {10, 20, 30, 40, 50},
                {15, 13, 11, 9, 7},
                {91, 101, 111, 121, 131},
        };
        int m = 5;
        int qanak = 0;

        for (int i = 0; i < m; i++){
            if ( matrix[0][i]%5 == 2){
                qanak++;
            }
        }
        for (int i = 1; i < m; i++){
            if ( matrix[1][i]%5 == 2){
                qanak++;
            }
        }
        for (int i = 2; i < m; i++){
            if ( matrix[2][i]%5 == 2){
                qanak++;
            }
        }
        for (int i = 3; i < m; i++){
            if ( matrix[3][i]%5 == 2){
                qanak++;
            }
        }
        for (int i = 4; i < m; i++){
            if ( matrix[4][i]%5 == 2){
                qanak++;
            }
        }
        System.out.print(qanak);
    }
}
