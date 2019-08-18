package com.bdg.repetition.from301to310;

import java.util.Arrays;

public class Task301 {

    public static void main(String[] args) {

        int k = 5;
        int quantity = 0;

        for(int i = -99; i < 100; i++){
            if(Math.abs(i*k) >=10 && Math.abs(i*k) <= 99 ){
                quantity++;
            }
        }

        int[] array = new int[quantity];
        int index = 0;
        for(int i = -99; i < 100; i++){
            if(Math.abs(i*k) >=10 && Math.abs(i*k) <= 99 ){
                array[index] = i*k;
                index++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
