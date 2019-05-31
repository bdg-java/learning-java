package com.bdg.nhakobyan.lesson_6.exercises_from_271_to_300;

import java.util.Arrays;

public class exercise_279 {
    public static void main(String[] args) {
        int n = 15;
        char array [] = new char[n];
        int count = 0;
        for (int i = 0; i < n ; i++) {
            array[i] = (char) (Math.random() * (122 - 97 + 1) + 97);
            if (array[i]> 'k'){
                count++;
            }
        }
        System.out.print(Arrays.toString(array));
        System.out.println();
        int num = 0;
        char[] arr = new char[count];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > 'k' ){
                arr[num] = array[i];
                num++;
            }
        }
        System.out.print(Arrays.toString(arr));


    }
}
