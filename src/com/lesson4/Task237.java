package com.lesson4;

public class Task237 {
    public static void main(String[] args) {
        int[] a = IntegerArrayoperations.getDefaultArray();
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                c++;
            }
        }
        System.out.println("Count = " + c);
    }
}
