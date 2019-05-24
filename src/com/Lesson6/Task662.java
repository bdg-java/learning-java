package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task662 {
    public static void main(String[] args) {
        char[] a = CharArrayDeclaration.getDef_array();
        int n = a.length;
        char[] b = new char[n];
        char t = 'f';
        int f = 0;
        int l = n - 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > t)
                b[f++] = a[i];
            if (a[i] < t)
                b[l--] = a[i];
            if (a[i] == t)
                c++;
        }
        while (c > 0) {
            b[f++] = t;
            c--;
        }
        System.out.println(b);
    }
}
