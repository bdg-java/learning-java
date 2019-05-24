package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task665 {
    public static void main(String[] args) {
        boolean t = true;
        char[] a = CharArrayDeclaration.getDef_array();
        char[] b = new char[]{'A', 'a', '5', 'b', 'z', 'b', '2', 'a', 'H', '3'};
        int asize = a.length;
        int csize = a.length + b.length;
        char[] c = new char[csize];
        int f = 0;
        int l = csize - 1;
        int i = 0;
        for (i = 0; i < asize / 2; i++) {
            c[f++] = a[i];
            c[l--] = a[asize - 1 - i];
        }
        i = 0;
        while (f <= l) {
            c[f++] = b[i++];

        }
        System.out.println(c);

    }
}
