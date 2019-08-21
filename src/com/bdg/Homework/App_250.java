package com.bdg.Homework;

public class App_250 {
    public static void main(String[] args) {

        int sum = 1;
        int[] array = new int[10];

        array[0] = 2;
        array[1] = 4;
        array[2] = 5;
        array[3] = -6;
        array[4] = 0;
        array[5] = 11;
        array[6] = 44;
        array[7] = 19;
        array[8] = 32;
        array[9] = -66;

        for (int i = 0; i < array.length; i++) {
            if ((array[i] * i) % 3 == 2) {
                sum *= Math.pow(array[i], 2);
            }
        }
        System.out.println(sum);
    }
}
