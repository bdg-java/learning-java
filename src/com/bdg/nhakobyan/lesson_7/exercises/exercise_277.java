package com.bdg.nhakobyan.lesson_7.exercises;

import java.util.Arrays;

public class exercise_277 {
    public static void main(String[] args) {
        char array [] = {'a','b','c','d','d','e','f','g','e','i'};

        int j = 0;
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == 'd') {
                count++;
            }
        }
        char[] arr = new char[array.length-count];
        System.out.println(arr.length);
        for (int i = 0; i < array.length ; i++) {
            if (array[i] != 'd'){
                arr[j] = array[i];
                j++;
            }
        }
        System.out.print(Arrays.toString(arr));


    }
}
