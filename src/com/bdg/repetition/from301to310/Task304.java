package com.bdg.repetition.from301to310;

import java.util.Arrays;

public class Task304 {

    public static void main(String[] args) {

        int n = 3869;
        int quantity = 0;

        for(int i = n; i > 0; i--){
            if(n%i == 2){
                quantity++;
            }
        }

        int[] aray = new int[quantity];
        int index = 0;

        for(int i = n; i > 0; i--){
            if(n%i == 2){
                aray[index] = i;
                index++;
            }
        }
        System.out.println(Arrays.toString(aray));
    }

}
