package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task660 {
    public static void main(String[] args) {
        char[] a = CharArrayDeclaration.getDef_array();
        int n = a.length;
        char[] b = new char[n];
        int k = 2;
        for (int i = 0; i < n; i++) {
            if (i == k) {
                b[i] = 'a';
                k += 3;
            } else
                b[i] = a[i];
        }
        System.out.println(b);
    }
}
