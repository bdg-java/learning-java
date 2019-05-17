package com.bdg.nhakobyan.lesson_6;

public class exercise_244 {
    public static void main(String[] args) {
        int[] arr = {12, 37, 7, 0, 1, 12, 102, 4, 8, 4, 0, 27};
        int mult = 1;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 5 == 2){
                mult *= arr[i];
                System.out.println(arr[i]);
            }
        }
        System.out.println(mult);

    }
}
