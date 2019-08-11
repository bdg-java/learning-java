package com.bdg.repetition.from151to190;

import java.util.Arrays;

public class Task176 {

    public static void main(String[] args) {

        int N = 7;
        int F1 = 1;
        int F2 = 1;

        int[] array = new int[N];
        array[0] = F1;
        array[1] = F2;
        for(int i = 2; i < N; i++){
            array[i] = array[i-2] + array[i-1];
        }
        System.out.println(Arrays.toString(array));
    }

}
