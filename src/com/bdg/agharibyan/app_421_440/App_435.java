package com.bdg.agharibyan.app_421_440;

public class App_435 {
    public static void main(String[] args) {

        double [][] matrix = new double[][]{
                {0, 1, 2, 3, 4, 5},
                {9, 8, 0, 6, 5, 4},
                {5, 2, 3, 4, 0, -6.1},
                {9, 10, 1, 1, 3.2, -10.1},
                {-9, -6, -1, -1, -3.1, -8.2},
                {1.3, 1.8, 1.5, 9.3, 7.2, 5.68},
        };
        int n = 6;
        int qanak = 0;

//        for (int i = 0; i < n-1; i++){
//            if ((int)matrix[0][i]%5 == 0){
//                qanak++;
//            }
//        }
//        for (int i = 0; i < n-2; i++){
//            if ((int)matrix[1][i]%5 == 0){
//                qanak++;
//            }
//        }
//        for (int i = 0; i < n-3; i++){
//            if ((int)matrix[2][i]%5 == 0){
//                qanak++;
//            }
//        }
//        for (int i = 0; i < n-4; i++){
//            if ((int)matrix[3][i]%5 == 0){
//                qanak++;
//            }
//        }
//        for (int i = 0; i < n-5; i++){
//            if ((int)matrix[4][i]%5 == 0){
//                qanak++;
//            }
//        }
//        System.out.print(qanak);

        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                if(k < n - 1 - i){
                    if((int)matrix[i][k]%5 == 0){
                        qanak++;
                    }
                }
            }
        }
        System.out.print(qanak);
    }
}
