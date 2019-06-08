package com.bdg.agharibyan.app_421_440;

public class App_422 {
    public static void main(String[] args) {

        int [][] matrix = new int[][]{
                {0, 1, 2, 3, 4},
                {91, 82, 73, 64, 55},
                {10, 20, 30, 40, 50},
                {15, 13, 11, 9, 7},
                {91, 101, 111, 121, 131},
        };
        int m = 5;
        int qanak = 0;
        int gumar = 0;

//        for(int i = 0; i < 1; i++){
//            if( matrix[1][i]%5 == 0) {
//                qanak++;
//                gumar += matrix[1][i];
//            }
//        }
//        for(int i = 0; i < 2; i++){
//            if( matrix[2][i]%5 == 0) {
//                qanak++;
//                gumar += matrix[2][i];
//            }
//        }
//        for(int i = 0; i < 3; i++){
//            if( matrix[3][i]%5 == 0) {
//                qanak++;
//                gumar += matrix[3][i];
//            }
//        }
//        for(int i = 0; i < 4; i++){
//            if( matrix[4][i]%5 == 0) {
//                qanak++;
//                gumar += matrix[4][i];
//            }
//        }
//        System.out.print((double)gumar/qanak);

        for(int i = 0; i < m ; i++){
            for(int k = 0; k < m; k++){
                if(k < i){
                    if(matrix[i][k]%5 == 0){
                        qanak++;
                        gumar += matrix[i][k];
                    }
                }
            }
        }
        System.out.println((double)gumar/qanak);
    }
}
