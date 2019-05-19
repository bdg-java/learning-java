package com.lesson5;

public class Task274 {
    public static void main(String[] args) {
        int c = 0;
        int sum = 0;
        char[] a = CharArrayDeclaration.getDef_array();
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 'h') {
                sum += i;
                c++;
            }
        }
        System.out.println(sum / c);
    }
}
