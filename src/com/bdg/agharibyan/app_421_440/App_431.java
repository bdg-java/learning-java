package com.bdg.agharibyan.app_421_440;

public class App_431 {
    public static void main(String[] args) {

        double matrix[][] = new double [][]{
                {0, 1, 2, 3, 4, 5},
                {9, 8, 7, 6, 5, 4},
                {1, 2, 3, 4, 0, -6},
                {9, 0, 1, 1, 3.2, -9.1},
                {-9, -6, -1, -1, -3.1, -8.2},
                {1.3, 1.8, 1.5, 9.3, 7.2, 5.6},
        };
        int n = 6;
        int qanak = 0;

//        for( int i = n-1; i < n; i++){
//            if ( (0 + i)%2 != 0){
//                qanak ++;
//            }
//        }
//        for( int i = n-2; i < n; i++){
//            if ( (1 + i)%2 != 0){
//                qanak ++;
//            }
//        }
//        for( int i = n-3; i < n; i++){
//            if ( (2 + i)%2 != 0){
//                qanak ++;
//            }
//        }
//        for( int i = n-4; i < n; i++){
//            if ( (3 + i)%2 != 0){
//                qanak ++;
//            }
//        }
//        for( int i = n-5; i < n; i++){
//            if ( (4 + i)%2 != 0){
//                qanak ++;
//            }
//        }
//        for( int i = n-6; i < n; i++){
//            if ( (5 + i)%2 != 0){
//                qanak ++;
//            }
//        }
//        System.out.println(qanak);

        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                if(k >= n - 1 - i){
                    if((i+k)%2 != 0){
                        qanak++;
                    }
                }
            }
        }
        System.out.print(qanak);
    }
}
