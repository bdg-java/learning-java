package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task655 {
    public static void main(String[] args) {
        char[] a = CharArrayDeclaration.getDef_array();
        int n = a.length;
        char t;
        char[] b = new char[n];
        for (int i = 0; i < n; i++) {
            b[n - i - 1] = a[i];
        }
        System.out.println(b);
    }
}
