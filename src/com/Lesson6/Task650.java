package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task650 {
    public static void main(String[] args) {
        int c = 0;
        char[] a = CharArrayDeclaration.getDef_array();
        boolean t = true;
        char[] b = new char[]{'b', 'b', 'z', 'H'};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                int p = i - 1;
                while (p >= 0) {
                    if (a[i] == a[p]) {
                        t = false;
                        break;
                    }
                    p--;
                }
                if (t == true && a[i] == b[j]) {
                    c++;
                    break;
                }
            }
        }
        System.out.println(c);
    }
}
