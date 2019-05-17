package com.bdg.nhakobyan.lesson_6;

public class exercise_227 {
    public static void main(String[] args) {
        int [] arr = {10 ,35, 7,0,1,12,98,4,8,4,0,9};
        int k = 3;
        double count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if ( i % k == 0){
                sum += arr[i];
                count++;
            }
        }
        System.out.println("The arithmetic average is "+ sum / count);

    }
}
