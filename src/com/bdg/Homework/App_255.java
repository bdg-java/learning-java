package com.bdg.Homework;

public class App_255 {
    public static void main(String[] args) {


        int[] array = new int[10];
        int max = array[0];
        int sum=0 ;

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

        for (int i = 0; i < array.length - 1; i++) {
            if (max < array[i + 1]) {
                max = array[i + 1];
                sum = i + max + 1;
            }
        }
        System.out.println(sum);
    }

}

