package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task647 {
    public static void main(String[] args) {
        boolean t = false;
        char[] a = CharArrayDeclaration.getDef_array();
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            if (a[i] == a[n - 1 - i])
                t = true;
            else {
                t = false;
                break;
            }
        }
        System.out.println(t);
    }
}
