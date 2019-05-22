package com.bdg.nhakobyan.lesson_7.exercises;

import java.util.Arrays;

public class exercise_293 {
    public static void main(String[] args) {
        int n = 8;
        int [] x = new int[n];
        int a = 33;
        int b = 65;
        int count = 0;
        int num = 0;

        for (int i = 0; i < n ; i++) {
            x[i] = (int)(Math.random()*(99-14+1)+14);
            if (x[i] >= a && x[i] <= b){
                count++;
            }
        }
        int [] y = new int[n-count];
        System.out.print(Arrays.toString(x));
        System.out.println();
        for (int i = 0; i < x.length ; i++) {
            if (x[i] < a || x[i] > b ){
                y[num] = x[i];
                num++;
            }
        }
        System.out.print(Arrays.toString(y));
    }
}
