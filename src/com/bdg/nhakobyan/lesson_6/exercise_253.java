package com.bdg.nhakobyan.lesson_6;

public class exercise_253 {
    public static void main(String[] args) {
        int[] arr = {4, 16, 7, -20, 6, 2, 9, 3, 8, 1, 0, 9,12,45,6,7,12};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
            else if (min > arr[i]){
                min = arr [i];
            }
        }
        System.out.println(max +" + "+ min +" = "+ (max+min));
    }
}