package com.bdg.nhakobyan.lesson_5;

public class exercise_255 {
    public static void main(String[] args) {
        int[] arr = {4, 16, 7, -20, 6, 2, 9, 3, 8, 1, 0, 9,12,4,6,7,122};
        int max = arr[0];
        int index= 0;
        for (int i = 0; i < arr.length ; i++) {
            if (max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max + " + " + index +" = " + (max+index));
    }
}
