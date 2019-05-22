package com.bdg.nhakobyan.lesson_7.exercises_from_271_to_300;

import java.util.Arrays;

public class exercise_280 {
    public static void main(String[] args) {
        int n = 10;
        char array [] = {'a','b','c','f','g','e','f','g','e','g'};
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ,");
            if (array[i]== 'f'){
                count++;
            }
        }
        char[] arr = new char[array.length+count];

        int num = 0;
        for (int i = 0; i < array.length ; i++) {
            arr[num ] = array[i];
            if (array[i]== 'f'){
                arr[num+1] = array[i];
                num += 1;
//
            }
            num++;
        }
        System.out.print("\n"+ Arrays.toString(arr));
    }
}
