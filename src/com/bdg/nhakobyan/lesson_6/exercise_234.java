package com.bdg.nhakobyan.lesson_6;

public class exercise_234 {
    public static void main(String[] args) {
        int [] arr = {10 ,35, 7,0,1,12,98,4,8,4,0,9};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 != 0){
            sum +=  arr[i];
            count++;
            }
        }
        System.out.println("math. average is : "+sum / count);
    }
}
