package com.bdg.agharibyan.app_151_190;

import java.util.Arrays;

/**
 * @author Ani Gharibyan
 */
public class App_176 {
    public static void main (String [] args){

        int n = 5;
        int i1 = 1;
        int i2 = 1;

//        System.out.println(i1);
//        System.out.println(i2);
//
//        int i3 = i1 + i2;
//        int i4 = i2 + i3;
//        int i5 = i3 + i4;
//
//        System.out.println(i3);
//        System.out.println(i4);
//        System.out.println(i5);

        int [] fibonachiArray = new int [n];
        fibonachiArray[0] = i1;
        fibonachiArray[1] = i2;

        for(int i = 2; i < n; i++){
            fibonachiArray[i] = fibonachiArray[i-2] + fibonachiArray[i-1];
        }
        System.out.print(Arrays.toString(fibonachiArray));
    }
}
