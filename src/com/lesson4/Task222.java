package com.lesson4;

public class Task222 {
    public static void main(String[] args) {
        int c = 0;
        int a = 2;
        int b = 4;
        int[] arr = IntegerArrayoperations.getDefaultArray();
        if (a >= 0 && b <= arr.length - 1) {
            for (int i = a + 1; i < b; i++) {
                c++;
            }
            System.out.println(c);
        }
    }
}
