package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task664 {
    public static void main(String[] args) {
        char[] a = CharArrayDeclaration.getDef_array();
        char x = '~';
        int c = 0;
        boolean t = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > x) {
                t = true;
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (t == true && (a[i] == 'c')) {
                    c++;
            }
            if (t == false && (a[i] == 'd')) {
                    c++;
            }
        }
        System.out.println(c);
    }
}
