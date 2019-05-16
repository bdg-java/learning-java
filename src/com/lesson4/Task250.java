package com.lesson4;

public class Task250 {
    public static void main(String[] args) {
        int mul = 1;
        int[] a = IntegerArrayoperations.getDefaultArray();
        for (int i = 0; i < a.length; i++) {
            if ((a[i] * i) % 3 == 2)
                mul *= a[i] * a[i];
        }
        System.out.println(mul);
    }
}
