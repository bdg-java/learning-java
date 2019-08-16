package com.bdg.repetition.from211to230;

import java.util.Arrays;
import java.util.Random;

public class Task230 {

    public static void main(String[] args) {

        int n = 10;
        double[] array = new double[n];

        for(int i = 0; i < n; i++) {
            array[i] = new Random().nextDouble()*100;
        }

        System.out.println(Arrays.toString(array));

        int k = 3;
        int sum = 0;
        int quantity = 0;

        for(int i = 0; i < n; i++){
            if((int)array[i]%k == 0){
                sum += Math.pow(array[i],2);
                quantity++;
                System.out.println("k tvin bazmapatik amboghj mas unecogh tarr: " + array[i]);
            }
        }
        System.out.println("k tvin bazmapatik amboghj mas unecogh tarreri mijin qarakusayin: " + Math.sqrt(sum/quantity));

    }

}
