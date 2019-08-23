package com.bdg.nhakobyan.lesson_6.exercises_from_271_to_300;

import java.util.Arrays;

public class exercise_299 {
    public static void main(String[] args) {
        int n = 8;
        int [] x = new int[n];
        int count = 0;
        int num = 0;
        for (int i = 0; i < n ; i++) {
            x[i] = (int)(Math.random()*(99-23+1)+23);
            if (x[i] % 2 != 0){
                count++;
            }
        }
        System.out.print(Arrays.toString(x));
        System.out.println();
        int [] y = new int[n-count];
        for (int i = 0; i < n ; i++) {
            if (x[i] % 2 == 0){
                y[num] = x[i];
                num++;
            }
        }
        System.out.print(Arrays.toString(y));
        System.out.println();


    }
}
