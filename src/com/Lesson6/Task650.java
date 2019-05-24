package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task650 {
    public static void main(String[] args) {
        int c = 0;
        char[] a = CharArrayDeclaration.getDef_array();
        boolean t = true;
        char[] b = new char[]{'a', 'b', 'z', 'b', 'a', 'A', 'H'};
        for (int i = 0; i < a.length; i++) {
            for (int p = i - 1; p >= 0; p--) {
                if (a[i] == a[p]) {
                    t = false;
                    break;
                } else t = true;
            }
            if (t == true) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        c++;
                        break;
                    }
                }
            }
        }
        System.out.println(c);
    }
}
