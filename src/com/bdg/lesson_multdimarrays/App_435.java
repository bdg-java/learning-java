package com.bdg.lesson_multdimarrays;

public class App_435 {
    public static void main(String[] args) {
        double[][] array = MultDimArrays.getDoubleArray();
        int count = 0;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i+j < array.length-1 && (int) array[i][j]%5==0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
