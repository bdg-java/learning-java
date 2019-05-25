package com.bdg.agharibyan.app_421_440;

public class App_428 {
    public static void main(String[] args) {

        int [][] matrix = new int [][]{
                {1, 1, 2, 3, 0},
                {91, 82, 73, 64, 55},
                {10, 20, 30, 40, 50},
                {15, 13, 11, 9, 0},
                {0, 101, 111, 121, 131},
        };
        int m = 5;
        int qanak = 0;

//        for(int i = 0; i < 5; i++){
//            if (matrix[0][i] == 0){
//                qanak++;
//            }
//        }
//        for(int i = 0; i < 4; i++){
//            if (matrix[1][i] == 0){
//                qanak++;
//            }
//        }
//        for(int i = 0; i < 3; i++){
//            if (matrix[2][i] == 0){
//                qanak++;
//            }
//        }
//        for(int i = 0; i < 2; i++){
//            if (matrix[3][i] == 0){
//                qanak++;
//            }
//        }
//        for(int i = 0; i < 1; i++){
//            if (matrix[4][i] == 0){
//                qanak++;
//            }
//        }
//        System.out.println(qanak);

        for(int i = 0; i < m; i++){
            for(int k = 0; k < m; k++){
                if(k <= m - 1 - i){
                    if(matrix[i][k] == 0){
                        qanak++;
                    }
                }
            }
        }
        System.out.print(qanak);
    }
}
