package com.bdg.Algorithm_Types;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int num[] = {12, 3, 9, 54, 32, 2, 15};


        for (int i = num.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (num[j] > num[j + 1]) {
                    int tmp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tmp;

                }

            }

        }
        System.out.println(Arrays.toString(num));
    }
}
