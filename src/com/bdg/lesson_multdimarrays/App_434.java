package com.bdg.lesson_multdimarrays;

public class App_434 {
    public static void main(String[] args) {
        double[][] array = MultDimArrays.getDoubleArray();
        double sum = 0;
        double a = 5.4;
        double b = 15.3;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i+j >= array.length-1 && (Math.abs(array[i][j])>=a && Math.abs(array[i][j])<=b)) {
                    sum+=array[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}
