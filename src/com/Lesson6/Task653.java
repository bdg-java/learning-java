package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task653 {
    public static void main(String[] args) {
        char[] a = CharArrayDeclaration.getDef_array();
        int n = a.length - 1;
        int c = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 'a')
                c++;
        }
        char[] b = new char[n + c];
        for (int i = 0; i < n; i++) {
            if (a[i] == 'a') {
                b[j] = a[i];
                b[j + 1] = 'c';
                j++;
            } else
                b[j] = a[i];
            j++;

        }
        System.out.println(b);
    }
}
