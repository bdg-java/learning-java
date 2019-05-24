package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task656 {
    public static void main(String[] args) {
        char[] a = CharArrayDeclaration.getDef_array();
        int n = a.length - 1;
        int c = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 'x')
                c++;
        }
        char[] b = new char[n + c];
        for (int i = 0; i < n; i++) {
            if (a[i] == 'x') {
                b[j] = 'y';
                b[j + 1] = 'y';
                j++;
            } else
                b[j] = a[i];
            j++;

        }
        System.out.println(b);
    }
}
