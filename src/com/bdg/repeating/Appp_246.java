package com.bdg.repeating;

import java.util.Random;

public class Appp_246 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int sum = 0;
        int count = 0;
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = ran.nextInt(10);
            if(Math.sqrt(i) == 0){
                count++;
                sum+= arr[i];

            }
        }
        System.out.println(sum/count);

    }
}
