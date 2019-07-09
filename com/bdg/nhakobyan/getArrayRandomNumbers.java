package com.bdg.nhakobyan;

import java.sql.Array;
import java.util.Arrays;

public class getArrayRandomNumbers {
    public static void randomArrayNumbers(int [][] array ,int a ,int b){
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array.length ; j++) {
                array[i][j] = (int)(Math.random()*(b-a+1)+a);
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void randomArrayNumbers(int [] array ,int a ,int b){
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int)(Math.random()*(b-a+1)+a);
        }
        System.out.println(Arrays.toString(array));
    }

}
