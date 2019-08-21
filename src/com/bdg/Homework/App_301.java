package com.bdg.Homework;

import java.util.Arrays;

public class App_301 {

    public static void main(String[] args) {

        int k = 5;
        int count = 0;

        for(int i = -99; i < 100; i++){
            if(Math.abs(i*k) >=10 && Math.abs(i*k) <= 99 ){
                count++;
            }
        }

        int[] array = new int[count];
        int index = 0;
        for(int j = -99; j < 100; j++){
            if(Math.abs(j*k) >=10 && Math.abs(j*k) <= 99 ){
                array[index] = j*k;
                index++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
