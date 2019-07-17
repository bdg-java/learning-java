package com.bdg.Bank_Account_System;


import java.util.Random;


public class IntegerArrayoperations {

    public static int[] generateArrayWithRandomNumbers(int size) {
        int[] array = new int[size];
        for (int i = 1000; i < 9999; i++) {
            array[i] = new Random().nextInt(169);
        }
        return array;
    }

}