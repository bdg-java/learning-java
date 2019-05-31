package com.bdg.nhakobyan;

public class getArrayRandomNumbers {
    public static void randomArrayNumbers(int [][] array ,int a ,int b){
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array.length ; j++) {
                array[i][j] = (int)(Math.random()*(b-a+1)+a);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
