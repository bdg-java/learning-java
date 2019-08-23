package com.bdg.nhakobyan;

public class arrayPrint {
    public static void printArrayMatrix(int [][] array ){
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array.length ; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void printArray(int [] array ){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
