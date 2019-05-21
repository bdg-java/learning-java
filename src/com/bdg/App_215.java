package com.bdg;

import java.util.Arrays;
import java.util.Random;


public class App_215 {

    public static void main(String[] args) {

        int[] arr = {-10, 23, 45, -21, 57, -49, 98, 8, -28, 76};

        int sum = 0;

        for ( int i = 0; i < arr.length; i++){

            if (i % 2 == 0){

                sum += arr[i];


                System.out.println(arr[i]);

                System.out.println(arr.length);
                System.out.println("sum is :" + sum);


            }
        }

    }


    }
