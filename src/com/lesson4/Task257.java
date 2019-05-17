package com.lesson4;

public class Task257 {
    public static void main(String[] args) {
        int[] a = IntegerArrayoperations.getDefaultArray();
        int max = IntegerArrayoperations.getMaxElementOfArray(a);
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] == max)
                break;
        }
        System.out.println(i);
    }


}
