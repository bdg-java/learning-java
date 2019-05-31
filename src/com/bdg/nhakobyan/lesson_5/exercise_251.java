package com.bdg.nhakobyan.lesson_5;

public class exercise_251 {
    public static void main(String[] args) {
        int[] arr = {4, 16, 7, 0, 6, 2, 9, 3, 8, 1, 0, 9,12,45,6,7,12};
        int max =arr[0] ;
        for (int i = 1; i < arr.length ; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.print(max + " ");

    }

}
