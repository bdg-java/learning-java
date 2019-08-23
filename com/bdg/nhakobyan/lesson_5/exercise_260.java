package com.bdg.nhakobyan.lesson_5;

public class exercise_260 {
    public static void main(String[] args) {
        int[] arr = {4, 16, 7, -2, 6, -20, 9, 3, 8, 1, 0, 9,12,4,6,7,-122};
        int lastMin = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (lastMin > arr[i]){
                lastMin = arr[i];
            }
        }
        System.out.println("last min is "+ lastMin);
    }
}
