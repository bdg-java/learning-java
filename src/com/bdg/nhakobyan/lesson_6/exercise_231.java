package com.bdg.nhakobyan.lesson_6;

public class exercise_231 {
    public static void main(String[] args) {
        int [] arr = {10 ,35, 7,0,1,12,98,4,8,4,0,9};
        int sum = 0 ;
        int count = 0; // exercise 232 solution
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 == 0){
                sum += (int)Math.pow(arr[i],2);
                count++; // exercise 232
            }
        }
        System.out.println(sum);
        System.out.println("Exercise 232 , " + count);
    }
}
