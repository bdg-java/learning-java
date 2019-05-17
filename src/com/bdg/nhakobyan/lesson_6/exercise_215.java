package com.bdg.nhakobyan.lesson_6;

public class exercise_215 {
    public static void main(String[] args) {
        int [] arr = {10 ,35, 7,0,1,12,98,4,8,4,0,9};
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if ( i % 2 == 0 ) {
                sum += arr[i];
                System.out.println(arr[i]);
            }

        }
//        System.out.println(arr.length);
        System.out.println("sum is :" + sum);
    }
}
