package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task658 {
    public static void main(String[] args) {
        char[] a = CharArrayDeclaration.getDef_array();
        int n = a.length;
        char[] b = new char[n];
        for (int i = 0; i < n - 1; i += 2) {
            b[i] = a[i + 1];
            b[i + 1] = a[i];
        }
        System.out.println(b);
    }
}
