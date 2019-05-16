package com.lesson4;

public class Task219 {
    public static void main(String[] args) {
        int c = 0;
        int k = 10;
        int[] a = IntegerArrayoperations.getDefaultArray();
        for (int i = 1; i < a.length; i++) {
            if (k % i == 0)
                c++;
        }
        System.out.println(c);
    }
}
