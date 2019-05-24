package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task666 {
    public static void main(String[] args) {
        char[] a = CharArrayDeclaration.getDef_array();
        char[] b = new char[3];
        int asize = a.length / 2;
        int j = 0;
        for (int i = asize - 1; i <= asize + 1; i++) {
            b[j++] = a[i];
        }
        System.out.println(b);
    }
}
