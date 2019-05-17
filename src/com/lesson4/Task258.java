package com.lesson4;

public class Task258 {
    public static void main(String[] args) {
        int[] a = IntegerArrayoperations.getDefaultArray();
        int max = IntegerArrayoperations.getMaxElementOfArray(a);
        int i;
        for (i = a.length - 1; i > 0; i--) {
            if (a[i] == max)
                break;
        }
        System.out.println(i);
    }

}
