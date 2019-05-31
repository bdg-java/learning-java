package com.bdg.nhakobyan.lesson_5;

public class exercise_252 {
    public static void main(String[] args) {
        int[] arr = {4, 16, 7, 3, 6, 2, -1, 3, 8, 1,4, 9,12,45,6,7,-3 };
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println(min);
    }
}
