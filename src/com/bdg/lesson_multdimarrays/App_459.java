package com.bdg.lesson_multdimarrays;

public class App_459 {
    public static void main(String[] args) {
        int[][] array = MultDimArrays.getNegavtiveValueArray();
        int product = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i][j]<0) {
                    product*=array[i][j];
                }
            }
        }
        System.out.println(product);
    }
}
