package com.bdg.repeating;

import java.util.Random;

public class App_217 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int sum = 1;
        int count = 0;
        Random ran = new Random();
        for(int i = 0;i<10;i++){
            arr[i] = ran.nextInt(10);
            if(i%2 ==1 ){
                sum *= (int)Math.pow(arr[i],2);

            }
        }
        System.out.println(sum);
    }
}
