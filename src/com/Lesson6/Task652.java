package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task652 {
    public static void main(String[] args) {
        boolean t = true;
        char[] a = CharArrayDeclaration.getDef_array();
        int n = a.length - 1;
        char[] b = new char[]{'A', 'a', '5', 'b', 'z', 'b', '2', 'a', 'H', '3'};
        char[] narr = new char[n];
        int nsize = 0;
        for (int i = 0; i < n; i++) {
            for (int p = i - 1; p >= 0; p--) {
                if (a[i] == a[p]) {
                    t = false;
                    break;
                } else t = true;
            }
            if (t == true) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        narr[nsize++] = a[i];
                        break;
                    }
                }
            }
        }
        System.out.println(narr);
    }
}
