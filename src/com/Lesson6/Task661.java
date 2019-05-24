package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task661 {
    public static void main(String[] args) {
        char[] a = CharArrayDeclaration.getDef_array();
        int n = a.length;
        char[] b = new char[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 'v')
                break;
            else
                b[j++] = a[i];
        }
        System.out.println(b);
    }
}
