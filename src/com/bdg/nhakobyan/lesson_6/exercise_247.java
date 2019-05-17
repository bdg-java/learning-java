package com.bdg.nhakobyan.lesson_6;

public class exercise_247 {
    public static void main(String[] args) {
        int[] arr = {4, 16, 7, 0, 6, 2, 9, 3, 8, 1, 0, 9,12,45,6,7,12};
         int sum = 0;
         int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > i) {
                count++;
                sum += Math.pow(arr[i],2);
                System.out.println(arr[i]);
            }
        }
        System.out.println(Math.sqrt(sum / count));
    }
}
