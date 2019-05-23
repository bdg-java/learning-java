package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task646 {
    public static void main(String[] args) {
        int c = 0;
        char[] a = CharArrayDeclaration.getDef_array();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'a')
                c++;
        }
        System.out.println(c);
    }
}
