package com.bdg.Homework;

import java.util.Arrays;

public class App_304 {
    public static void main(String[] args) {
        int n = 4444;
        int count = 0;

        for (int i = n; i > 0; i--) {
            if (n % i == 2) {
                count++;
            }
        }

        int[] array = new int[count];
        int index = 0;

        for (int i = n; i > 0; i--) {
            if (n % i == 2) {
                array[index] = i;
                index++;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
