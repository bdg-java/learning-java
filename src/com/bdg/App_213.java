package com.bdg;

import java.util.Arrays;
import java.util.Random;



public class App_213 {

    public static void main(String[] args) {

        int[] arr = {-10, 23, 45, -21, 57, -49, 98, 8, -28, 76};

        double average = 0;

        for ( int i = 0; i < arr.length; i++){

            if (arr [i] < 0){

                average = Math.sqrt(Math.pow(arr[i],2)/arr.length);

                System.out.println("average is "+average);

            }
        }
    }
}
