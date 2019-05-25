package com.bdg.agharibyan.app_421_440;

public class App_427 {
    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {4, 1, 2, 3, 4},
                {91, 82, 73, 64, 55},
                {10, 20, 30, 40, 50},
                {15, 13, 11, 9, 7},
                {91, 101, 111, 121, 131},
        };
        int m = 5;
        int artadryal = 1;
        int k = 4;

//        for(int i = 0; i < 5; i++){
//            if (matrix[0][i]%k == 0){
//                artadryal = artadryal * matrix[0][i];
//            }
//        }
//        for(int i = 0; i < 4; i++){
//            if (matrix[1][i]%k == 0){
//                artadryal = artadryal * matrix[1][i];
//            }
//        }
//        for(int i = 0; i < 3; i++){
//            if (matrix[2][i]%k == 0){
//                artadryal = artadryal * matrix[2][i];
//            }
//        }
//        for(int i = 0; i < 2; i++){
//            if (matrix[3][i]%k == 0){
//                artadryal = artadryal * matrix[3][i];
//            }
//        }
//        for(int i = 0; i < 1; i++){
//            if (matrix[4][i]%k == 0){
//                artadryal = artadryal * matrix[4][i];
//            }
//        }
//        System.out.println(artadryal);

        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                if(j <= m - 1 - i){
                    if(matrix[i][j]%k == 0){
                        artadryal *= matrix[i][j];
                    }
                }
            }
        }
        System.out.print(artadryal);
    }
}
