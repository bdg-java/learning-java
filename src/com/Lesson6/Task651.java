package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task651 {
    public static void main(String[] args) {
        char[] a = CharArrayDeclaration.getDef_array();
        int n = a.length - 1;
        char[] b = new char[n];
        int c = 0;
        boolean t = true;
        int k = 0;
        for (int i = 0; i < n; ++i) {
            t = false;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                else {
                    if (a[i] == a[j]) {
                        t = false;
                        break;
                    } else
                        t = true;
                }
            }
            if (t == true)
                b[k++] = a[i];
        }
        System.out.println(b);
    }
}

