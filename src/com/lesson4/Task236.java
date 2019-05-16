package com.lesson4;

public class Task236 {
    public static void main(String[] args) {
        int[] a = IntegerArrayoperations.getDefaultArray();
        int c = 0;
        int mul = 1;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] & 1) == 1) {
                c++;
                mul *= a[i];
            }
        }
        System.out.println(" Mul = " + mul + " Count = " + c);
    }
}
