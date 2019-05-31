package com.bdg.nhakobyan.lesson_6.exercises_from_271_to_300;

import java.util.Arrays;

public class exercise_300 {
    public static void main(String[] args) {
        int n = 8;
        int [] x = new int[n];
        int k = 80;
        int num = 0;
        int count = 0;

        for (int i = 0; i < n ; i++) {
            x[i] = (int)(Math.random()*(14-3+1)+3);
            if (Math.pow(x[i],2) < k){
                count++;
            }
        }
        System.out.print(Arrays.toString(x));
        System.out.println();
        int [] y = new int[n-count];
        for (int i = 0; i < n ; i++) {
            if (Math.pow(x[i],2) > k){
                y[num] = x[i];
                num++;
            }
        }
        System.out.print(Arrays.toString(y));
    }
}
