package com.bdg.nhakobyan.lesson_6;

public class exercise_230 {
    public static void main(String[] args) {
        double [] arr = {10.5 ,35.3, 7.8,0,1,12,98,4,8,4,0.6,9};
        int k = 8;
        int amboxch = 0;
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < arr.length ; i++) {
            amboxch =  (int)(arr[i]*10) % 10 ;
            if (amboxch % k == 0) {
                sum += Math.pow(arr[i],2);
                counter++;
                System.out.println(arr[i]);
            }
        }
        System.out.println(Math.sqrt(sum/counter));
    }
}
