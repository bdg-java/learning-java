package com.bdg.agharibyan.app_421_440;

public class App_436 {
    public static void main(String[] args) {

        int matrix[][] = {
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5},
        };
        int n = 6;
        int qanak = 0;
        int gumar = 0;
        int a = 2;
        int b = 6;

        for (int i = 1; i < n; i++){
            if (matrix[i][0] >= a && matrix[i][0] <= b){
                qanak ++;
                gumar += matrix[i][0];
            }
        }
        for (int i = 2; i < n; i++){
            if (matrix[i][1] >= a && matrix[i][1] <= b){
                qanak ++;
                gumar += matrix[i][1];
            }
        }
        for (int i = 3; i < n; i++){
            if (matrix[i][2] >= a && matrix[i][2] <= b){
                qanak ++;
                gumar += matrix[i][2];
            }
        }
        for (int i = 4; i < n; i++){
            if (matrix[i][3] >= a && matrix[i][3] <= b){
                qanak ++;
                gumar += matrix[i][3];
            }
        }
        for (int i = 5; i < n; i++){
            if (matrix[i][4] >= a && matrix[i][4] <= b){
                qanak ++;
                gumar += matrix[i][4];
            }
        }
        System.out.print((double)gumar/qanak);
    }
}
