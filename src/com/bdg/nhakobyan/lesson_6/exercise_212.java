package com.bdg.nhakobyan.lesson_6;

public class exercise_212 {
    public static void main(String[] args) {
        int [] arr = {10 ,35, 7,0,1,12,98,4,8,4,0,9};
        System.out.println(arr.length);
        double average = 0;
        for (int i = 0; i < arr.length ; i++) {
            average = Math.sqrt(Math.pow(arr[i],2)/arr.length);
        }
        System.out.println("average is "+average);
    }
}
