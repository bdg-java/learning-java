package com.bdg.nhakobyan.lesson_5;

public class exercise_219 {
    public static void main(String[] args) {
        int [] arr = {10 ,35, 7,0,1,12,98,4,8,4,0,9};
        int k = 5;
        int counter = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (i % k == 0)
                counter++;
        }
        System.out.println(counter);
    }
}
