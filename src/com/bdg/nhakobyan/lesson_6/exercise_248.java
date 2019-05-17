package com.bdg.nhakobyan.lesson_6;

public class exercise_248 {
    public static void main(String[] args) {
        int[] arr = {4, 16, 7, 0, 36, 12, 98, 3, 8, 1, 0, 9,12,45,76,87,123};
        int k = 6;
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (Math.pow(arr[i]+i,2) % k == 0){
                sum += arr[i];
                System.out.println(arr[i] +" "+ i);
            }

        }
        System.out.println(sum);
    }
}
