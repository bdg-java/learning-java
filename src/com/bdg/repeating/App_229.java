package com.bdg.repeating;

import java.util.Random;

public class App_229 {
    public static void main(String[] args) {
    int arr[] = new int[10];
    int sum = 1;
    int count = 0;
    Random ran = new Random();
    for(int i = 1;i<10;i++){
        arr[i] = ran.nextInt(10);
        if(arr[i] / i > 0 ){
            sum *= arr[i];

        }
    }
    System.out.println(sum);
}
}
