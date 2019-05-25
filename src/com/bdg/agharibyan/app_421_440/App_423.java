package com.bdg.agharibyan.app_421_440;

public class App_423 {
    public static void main(String[] args) {

        int [][] matrix = new int [][]{
                {0, 1, 2, 3, 4},
                {91, 82, 73, 64, 55},
                {10, 20, 30, 40, 50},
                {15, 13, 11, 9, 7},
                {91, 101, 111, 121, 131},
        };
        int m = 5;
        int qanak = 0;
        double gumar = 0;

//        for(int i = 0; i < 1; i++){
//            if (matrix[0][i]%2 == 0){
//                qanak ++;
//                gumar += Math.pow(matrix[0][i],2);
//            }
//        }
//        for(int i = 0; i < 2; i++){
//            if (matrix[1][i]%2 == 0){
//                qanak ++;
//                gumar += Math.pow(matrix[1][i],2);
//            }
//        }
//        for(int i = 0; i < 3; i++){
//            if (matrix[2][i]%2 == 0){
//                qanak ++;
//                gumar += Math.pow(matrix[2][i],2);
//            }
//        }
//        for(int i = 0; i < 4; i++){
//            if (matrix[3][i]%2 == 0){
//                qanak ++;
//                gumar += Math.pow(matrix[3][i],2);
//            }
//        }
//        for(int i = 0; i < 5; i++){
//            if (matrix[4][i]%2 == 0){
//                qanak ++;
//                gumar += Math.pow(matrix[4][i],2);
//            }
//        }
//        System.out.println(Math.sqrt(gumar/qanak));

        for(int i = 0; i < m; i++){
            for(int k = 0; k < m; k++){
                if(k <= i){
                    if(matrix[i][k]%2 == 0){
                        qanak++;
                        gumar += Math.pow(matrix[i][k],2);
                    }
                }
            }
        }
        System.out.print(Math.sqrt(gumar/qanak));
    }
}
