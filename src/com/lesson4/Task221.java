package com.lesson4;

public class Task221 {
    public static void main(String[] args) {
        int c = -1;
        int d = 8;
        int mul = 1;
        int[] a = IntegerArrayoperations.getDefaultArray();
        if (c >= 0 && d <= a.length) {
            for (int i = c; i < d; i++) {
                if (a[i] != 0)
                    mul *= a[i];
            }
        }
        System.out.println(mul);
    }
}
