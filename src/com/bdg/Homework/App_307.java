package com.bdg.Homework;

import java.util.Arrays;

public class App_307 {
    public static void main(String[] args) {

        int count = 0;
        int index =0;

        for(int i = 100; i < 1000; i++){
            if((i%10 + i/10%10 + i/100%10) == 9){
                count++;
            }
        }
        int[] array = new int[count];


        for(int i = 100; i < 1000; i++){
            if((i%10 + i/10%10 + i/100%10) == 9){
                array[index] = i;
                index++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}

