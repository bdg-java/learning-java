package com.bdg.nhakobyan.lesson_5;

public class exercise_217 {
    public static void main(String[] args) {
        int [] arr = {10 ,35, 7,2,1,12,98,4,8,4,3,9};
        int mult = 1;
        for (int i = 0; i < arr.length ; i++) {
            if (i % 2 != 0){
                System.out.println(arr[i]);
                mult *= Math.pow(arr[i],2);
            }
        }
        System.out.println(mult);
    }
}
