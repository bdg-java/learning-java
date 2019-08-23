package com.bdg.nhakobyan.lesson_5;

public class exercise_257 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, -2, 1, -20, 9, 3, 8, 1, 0, 9,12,4,6,7,122};
        int firstMax = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if(firstMax < arr[i]){
                firstMax = arr[i];
                break;
            }
        }
        System.out.println("first max is : " + firstMax);
    }
}
