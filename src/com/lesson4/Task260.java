package com.lesson4;

public class Task260 {
    public static void main(String[] args) {
        int[] a = IntegerArrayoperations.getDefaultArray();
        int min = IntegerArrayoperations.getMinElementOfArray(a);
        int i;
        for (i = a.length - 1; i >= 0; i--) {
            if (a[i] == min)
                break;
        }
        System.out.println(i);
    }
}
