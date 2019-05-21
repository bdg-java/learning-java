package com.bdg.agharibyan.app_421_440;

public class App_421 {

    public static void main(String[] args) {

        int matrix[][] = {
                {0, 1, 2, 3, 4},
                {91, 82, 73, 64, 55},
                {10, 20, 30, 40, 50},
                {15, 13, 11, 9, 7},
                {91, 101, 111, 121, 131},
        };
        int m = 5;
        int k = 2;
        int qanak = 0;

        for (int i = 1; i < m; i++){
            if (matrix[i][0]%k == 0){
                qanak++;
            }
        }
        for (int i = 2; i < m; i++){
            if (matrix[i][1]%k == 0){
                qanak++;
            }
        }
        for (int i = 3; i < m; i++){
            if (matrix[i][2]%k == 0){
                qanak++;
            }
        }
        for (int i = 4; i < m; i++){
            if (matrix[i][3]%k == 0){
                qanak++;
            }
        }
        System.out.print(qanak);
    }
}
