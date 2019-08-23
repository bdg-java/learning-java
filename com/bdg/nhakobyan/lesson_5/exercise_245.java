package com.bdg.nhakobyan.lesson_5;

public class exercise_245 {
    public static void main(String[] args) {
        int[] arr = {10, 35, 7, 0, 1, 12, 98, 4, 8, 4, 0, 9};
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if ((arr[i] + i) % 3 == 0){
                sum += Math.pow(arr[i], 2);
            }
        }
    }
}
