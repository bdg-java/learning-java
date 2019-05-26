package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task657 {
    public static void main(String[] args) {
        char[] a = CharArrayDeclaration.getDef_array();
        int n = a.length;
        char[] b = new char[n / 2 + 1];
        int j = 0;
        for (int i = 0; i < n - 1; i += 2) {
            if (a[i] > a[i + 1])
                b[j] = a[i];
            else b[j] = a[i + 1];
            j++;
        }
        System.out.println(b);
    }
}
