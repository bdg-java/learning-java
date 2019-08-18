package com.bdg.repetition.from301to310;

import java.util.Arrays;

public class Task307 {

    public static void main(String[] args) {

        int quantity = 0;
        for(int i = 100; i < 1000; i++){
            if((i%10 + i/10%10 + i/100%10) == 9){
                quantity++;
            }
        }
        int[] array = new int[quantity];
        int index = 0;
        for(int i = 100; i < 1000; i++){
            if((i%10 + i/10%10 + i/100%10) == 9){
                array[index] = i;
                index++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
