package com.lesson4;

public class Task225 {
    public static void main(String[] args) {
        int t = 5;
        int mul = 1;
        int[] arr = IntegerArrayoperations.getDefaultArray();
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) < t && arr[i] != 0)
                mul *= arr[i];
        }
        System.out.println(mul);
    }

}
