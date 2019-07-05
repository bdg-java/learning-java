package com.algorithm;

import java.util.Random;

public class RandomArray {
    private static final int DEF_SIZE = 15;
    private static final int[] a = new int[DEF_SIZE];

    public static int[] getArray() {
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++)
            a[i] = rnd.nextInt(100);
        return a;
    }
}
