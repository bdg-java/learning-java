package com.bdg.repeating;
import java.util.Random;

public class App_215 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int sum = 0;
        int count = 0;
        Random ran = new Random();
        for(int i = 0;i<10;i++){
            arr[i] = ran.nextInt(100);
            if(i%2 ==0 ){
                sum+=arr[i];

            }
        }
        System.out.println(sum);
    }
}
