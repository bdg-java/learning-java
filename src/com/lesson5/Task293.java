package com.lesson5;

import com.lesson4.IntegerArrayoperations;

import java.util.Arrays;

public class Task293 {
    public static void main(String[] args) {
        int[] arr = IntegerArrayoperations.getDefaultArray();
        int a = 5;
        int b = 10;
        int j = 0;
        int c = GetIntegerArrayElNotInRangeCount(arr, a, b);
        int[] arr2 = new int[c];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < a || arr[i] > b) {
                arr2[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static int GetIntegerArrayElNotInRangeCount(int arr[], int a, int b) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < a || arr[i] > b) {
                c++;
            }
        }
        return c;
    }
}
