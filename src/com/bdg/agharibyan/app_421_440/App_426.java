package com.bdg.agharibyan.app_421_440;

public class App_426 {
    public static void main(String[] args) {

        int matrix[][] = {
                {0, 1, 2, 3, 4},
                {91, 82, 73, 64, 55},
                {10, 20, 30, 40, 50},
                {15, 13, 11, 9, 7},
                {91, 101, 111, 121, 131},
        };
//        int m = 5;
        int gumar = 0;

        for(int i = 0; i < 4; i++){
            if (matrix[0][i]%2 == 0){
                gumar += matrix[0][i];
            }
        }
        for(int i = 0; i < 3; i++){
            if( matrix[1][i]%2 == 0) {
                gumar += matrix[1][i];
            }
        }
        for(int i = 0; i < 2; i++){
            if( matrix[2][i]%2 == 0) {
                gumar += matrix[2][i];
            }
        }
        for(int i = 0; i < 1; i++){
            if( matrix[3][i]%2 == 0) {
                gumar += matrix[3][i];
            }
        }
        System.out.print(gumar);
    }
}
