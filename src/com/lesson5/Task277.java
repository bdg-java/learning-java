package com.lesson5;

public class Task277 {
    public static void main(String[] args) {
        char[] a = CharArrayDeclaration.getDef_array();
        char[] b = new char[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 'd') {
                b[j] = a[i];
                j++;
            }
        }
        System.out.println(b);
    }
}
