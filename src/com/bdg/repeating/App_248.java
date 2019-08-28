package com.bdg.repeating;

import java.util.Random;

public class App_248 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int sum = 0;
        int count = 0;
        int k = 2;
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = ran.nextInt(10);
            if(Math.pow((i+arr[i]),2)%k == 0){
                sum+= arr[i];

            }
        }
        System.out.println(sum);
    }

}
