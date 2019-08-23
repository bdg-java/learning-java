package com.bdg.nhakobyan.lesson_5;

public class exercise_221 {
    public static void main(String[] args) {
        int [] arr = {10 ,35, 7,0,1,12,98,4,8,4,0,9};
        int a = 5;
        int b = 8;
        int sum = 0 ;
        for (int i = a; i <= b ; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
