package com.bdg.nhakobyan.lesson_6;

public class exercise_229 {
    public static void main(String[] args) {
        int [] arr = {10 ,35, 7,0,1,12,98,4,8,4,0,9};
        int mult = 1;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] - i > 0)
                mult *= arr[i];
        }
        System.out.println(mult);
    }
}
