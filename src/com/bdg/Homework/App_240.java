package com.bdg.Homework;

public class App_240 {
    public static void main(String[] args) {


        int count = 0;
        int[] array = new int[10];

        array[0] = 2;
        array[1] = 4;
        array[2] = 5;
        array[3] = -6;
        array[4] = 3;
        array[5] = 11;
        array[6] = 49;
        array[7] = 19;
        array[8] = 32;
        array[9] = -66;

        for (int i = 0; i <array.length ; i++) {
            if (array[i] % 7 ==0){
                count ++;
            }
        }
        System.out.println(count);
    }
}
