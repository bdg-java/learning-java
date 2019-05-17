package com.bdg.nhakobyan.lesson_6;

public class exercise_250 {
    public static void main(String[] args) {
        int[] arr = {4, 16, 7, 0, 36, 12, 98, 3, 8, 1, 0, 9,12,45,76,87,123};
        int mult = 1;
        for (int i = 0; i < arr.length ; i++) {
            if ((arr[i] * i) % 3 == 2){
                mult *= Math.pow(arr[i],2);
                System.out.println(arr[i]);
            }
        }
        System.out.println(mult);
    }

}
