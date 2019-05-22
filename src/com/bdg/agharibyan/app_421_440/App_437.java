package com.bdg.agharibyan.app_421_440;

public class App_437 {
    public static void main(String[] args) {

        double matrix[][] = {
                {0, 1, 2, 3, 4, 5},
                {9, 8, 0, 6, 5, 4},
                {5, 2, 3, 4, 0, -6.1},
                {9, 10, 1, 1, 3.2, -10.1},
                {-9, -6, -1.1, -1, -3.1, -8.2},
                {1.3, 1.8, 1.5, 9.3, 7.2, 5.68},
        };
        int n = 6;
        int qanak = 0;
        double gumar = 0;

        for (int i = 0; i < n; i++){
            if (matrix[i][0]%1 == 0){
                qanak ++;
                gumar += Math.pow(matrix[i][0],2);

            }
        }
        for (int i = 1; i < n; i++){
            if (matrix[i][1]%1 == 0){
                qanak ++;
                gumar += Math.pow(matrix[i][1],2);
            }
        }
        for (int i = 2; i < n; i++){
            if (matrix[i][2]%1 == 0){
                qanak ++;
                gumar += Math.pow(matrix[i][2],2);
            }
        }
        for (int i = 3; i < n; i++){
            if (matrix[i][3]%1 == 0){
                qanak ++;
                gumar += Math.pow(matrix[i][3],2);
            }
        }
        for (int i = 4; i < n; i++){
            if (matrix[i][4]%1 == 0){
                qanak ++;
                gumar += Math.pow(matrix[i][4],2);
            }
        }
        for (int i = 5; i < n; i++){
            if (matrix[i][5]%1 == 0){
                qanak ++;
                gumar += Math.pow(matrix[i][5],2);
            }
        }
        System.out.print(Math.sqrt(gumar/qanak));

    }
}
