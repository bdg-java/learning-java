package com.bdg.nhakobyan.lesson_6;

import java.lang.reflect.Array;
import java.util.Random;

public class exercise_211 {
    public static void main(String[] args) {
        int [] arr = {10 ,35, 7,0,1,12,98,4,8,4,0,9};
        System.out.println(arr.length);
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The arithmetical average is " + (double)sum/arr.length);

    }


}
