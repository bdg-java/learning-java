package com.bdg.agharibyan.app_421_440;

public class App_438 {
    public static void main(String[] args) {

        int matrix[][] = {
                {0, 1, 2, 3, 4, 5},
                {9, 8, 0, 6, 5, 4},
                {5, 2, 3, 4, 0, -6},
                {9, 10, 1, 1, 3, -1},
                {-1, -1, 1, 9, 7, 5},
                {-9, -6, -1, -1, -3, -8},
        };
        int n = 6;
        int qanak = 0;

        for (int i = 1; i < n; i++){
            if (matrix[i][0] > 0 && 0%2 == 0){
                qanak ++;
            }
        }
        for (int i = 2; i < n; i++){
            if (matrix[i][1] > 0 && 1%2 == 0){
                qanak ++;
            }
        }
        for (int i = 3; i < n; i++){
            if (matrix[i][2] > 0 && 2%2 == 0){
                qanak ++;
            }
        }
        for (int i = 4; i < n; i++){
            if (matrix[i][3] > 0 && 3%2 == 0){
                qanak ++;
            }
        }
        for (int i = 5; i < n; i++){
            if (matrix[i][4] > 0 && 4%2 == 0){
                qanak ++;
            }
        }
        System.out.print(qanak);
    }
}
