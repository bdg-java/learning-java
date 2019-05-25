package com.bdg.agharibyan.app_421_440;

public class App_432 {
    public static void main(String[] args) {

        double [][] matrix = new double[][]{
                {0, 1, 2, 3, 4, 5},
                {9, 8, 7, 6, 5, 4},
                {1, 2, 3, 4, 0, -6},
                {9, 0, 1, 1, 3.2, -9.1},
                {-9, -6, -1, -1, -3.1, -8.2},
                {1.3, 1.8, 1.5, 9.3, 7.2, 5.68},
        };
        int n = 6;
        int qanak = 0;
        int gumar = 0;

//        for (int i = 0; i < n; i++){
//            if ((0+i)%2 != 0){
//                qanak++;
//                gumar += Math.pow(matrix[0][i],2);
//            }
//        }
//        for (int i = 0; i < n-1; i++){
//            if ((1+i)%2 != 0){
//                qanak++;
//                gumar += Math.pow(matrix[1][i],2);
//            }
//        }
//        for (int i = 0; i < n-2; i++){
//            if ((2+i)%2 != 0){
//                qanak++;
//                gumar += Math.pow(matrix[2][i],2);
//            }
//        }
//        for (int i = 0; i < n-3; i++){
//            if ((3+i)%2 != 0){
//                qanak++;
//                gumar += Math.pow(matrix[3][i],2);
//            }
//        }
//        for (int i = 0; i < n-4; i++){
//            if ((4+i)%2 != 0){
//                qanak++;
//                gumar += Math.pow(matrix[4][i],2);
//            }
//        }
//        for (int i = 0; i < n-5; i++){
//            if ((5+i)%2 != 0){
//                qanak++;
//                gumar += Math.pow(matrix[5][i],2);
//            }
//        }
//        System.out.print(Math.sqrt(gumar/qanak));

        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                if(k <= n - 1 - i){
                    if((i + k)%2 != 0){
                        qanak++;
                        gumar += Math.pow(matrix[i][k],2);
                    }
                }
            }
        }
        System.out.print(Math.sqrt(gumar/qanak));
    }
}
