package com.bdg.repeating;

import java.util.Random;

public class App_211 {
    private static int[] anArray;
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        anArray = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++)
        {
            anArray[i] = rand.nextInt(100);
            if(anArray[i]> 0){
                sum += anArray[i];
                count++;
            }
        }

        System.out.println(sum/count);


    }


}
