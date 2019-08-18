package com.bdg.repetition.from333to342;

public class Task340 {

    public static void main(String[] args) {

        int n = 13;
        int[] X = {0, -5, 28, -10, 9, -16, 0, 25, -7, 100, 5, 38, -48};

        int min = X[2];

        for(int i = 0; i < X.length; i++){
            if(i%5 == 2){
                if(X[i] < min){
                    min  = X[i];
                }
            }
        }
        System.out.println(min);
    }

}
