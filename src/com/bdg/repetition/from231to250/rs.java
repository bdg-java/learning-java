package com.bdg.repetition.from231to250;

import java.util.Arrays;
import java.util.Random;

public class rs {

    static int n = 10;
    static int[] array = new int[n];

    public static int[] buildIntegerArray(){
        for(int i = 0; i < n; i++ ){
        array[i] = new Random().nextInt(100);
        }
        System.out.println("Array is " + Arrays.toString(array));
        return array;
    }
}
