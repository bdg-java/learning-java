package com.bdg.nhakobyan.lesson_6.exercises_from_271_to_300;

import java.util.Arrays;

public class exercise_278 {
    public static void main(String[] args) {
        int n = 15;
        char array [] = new char[n];

        int count = 0;
        for (int i = 0; i < n ; i++) {
            array[i] = (char) (Math.random() * (122 - 97 + 1) + 97);
            if (i % 2 != 0){
                count++;
            }
        }
        System.out.print(Arrays.toString(array));
        char[] arr = new char[array.length-count];
        int num = 0;
        System.out.println();
        for (int i = 0; i < array.length ; i++) {
            if (i % 2 != 0){
                arr[num] = array[i];
                num++;
            }
        }
        System.out.print(Arrays.toString(arr) );
    }
}
