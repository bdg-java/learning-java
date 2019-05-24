package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task669 {
    public static void main(String[] args) {
        char[] a = new char[]{'A', 'a', '5', 'b', '5', 'a', 'A'};//CharArrayDeclaration.getDef_array();
        int n = a.length;
        boolean t = false;
        int c = 0;
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - 1 - i]) {
                t = false;
                break;
            } else t = true;
        }
        for (int i = 0; i < n; i++) {
            if (t == true && (a[i] == 'a'))
                c++;
            if (t == false && (a[i] == 'b'))
                c++;

        }
        System.out.println(c);
    }
}
