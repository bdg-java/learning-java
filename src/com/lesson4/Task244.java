package com.lesson4;

public class Task244 {
    public static void main(String[] args) {
        int mul = 1;
        int[] a = IntegerArrayoperations.getDefaultArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 2) {
                mul *= a[i];
            }
        }
        System.out.println(mul);
    }
}
