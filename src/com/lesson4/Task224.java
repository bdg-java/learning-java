package com.lesson4;

public class Task224 {
    public static void main(String[] args) {
        int k = 5;
        int sum = 0;
        int[] arr = IntegerArrayoperations.getDefaultArray();
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) < k)
                sum += Math.pow(arr[i], 3);
        }
        System.out.println(sum);
    }
}

