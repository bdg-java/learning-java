package com.bdg.nhakobyan.lesson_5;

public class exercise_238 {
    public static void main(String[] args) {
        int[] arr = {12, 30, 7, 3, 1, 36, 98, 4, 8, 4, 0, 9};
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 3 == 0){
                sum += arr[i];
                count++;
                System.out.println(arr[i]);
            }
        }
        System.out.println((double) sum / count);

    }
}
