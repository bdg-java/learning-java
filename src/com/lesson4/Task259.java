package com.lesson4;

public class Task259 {
    public static void main(String[] args) {
        int[] a = IntegerArrayoperations.getDefaultArray();
        int min = IntegerArrayoperations.getMinElementOfArray(a);
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] == min)
                break;
        }
        System.out.println(i);
    }
}
