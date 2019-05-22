package com.bdg.nhakobyan.lesson_7.exercises_from_271_to_300;

import java.util.Arrays;

public class exercise_292 {
    public static void main(String[] args) {
        int n = 8;
        int [] x = new int[n];
        int count = 0;
        int num = 0;

        for (int i = 0; i < n ; i++) {
            x[i] = (int)(Math.random()*(70-14+1)+14);
            if (x[i] % 7 ==0){
                count++;
            }
        }
        System.out.print(Arrays.toString(x));

        System.out.println();
        int [] y = new int[n-count];
        for (int i = 0; i < n ; i++) {
            if (x[i] % 7 != 0){
                y[num] = x[i];
                num++;
            }
        }
        System.out.print(Arrays.toString(y));
    }
}
