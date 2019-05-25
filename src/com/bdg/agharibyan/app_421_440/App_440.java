package com.bdg.agharibyan.app_421_440;

public class App_440 {
    public static void main(String[] args) {

        int [][] matrix = new int [][]{
                {8, 1, 2, 3, 4, 5},
                {9, 8, 0, 6, 5, 4},
                {5, 2, 3, 4, 0, 6},
                {9, 10, 1, 1, 3, 1},
                {-1, -1, 1, 9, 7, 5},
                {9, 6, -1, -1, 3, 8},
        };
        int n = 6;
        int gumar = 0;

//        for( int i = 1; i < n; i++){
//            if((0 + i)%2 == 0){
//                gumar += matrix[0][i];
//            }
//        }
//        for( int i = 2; i < n; i++){
//            if((1 + i)%2 == 0){
//                gumar += matrix[1][i];
//            }
//        }
//        for( int i = 3; i < n; i++){
//            if((2 + i)%2 == 0){
//                gumar += matrix[2][i];
//            }
//        }
//        for( int i = 4; i < n; i++){
//            if((3 + i)%2 == 0){
//                gumar += matrix[3][i];
//            }
//        }
//        for( int i = 5; i < n; i++){
//            if((4 + i)%2 == 0){
//                gumar += matrix[4][i];
//            }
//        }
//        System.out.print(gumar);

        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                if(k > i){
                    if((i + k)%2 == 0){
                        gumar += matrix[i][k];
                    }
                }
            }
        }
        System.out.print(gumar);
    }
}
