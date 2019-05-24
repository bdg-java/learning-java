
package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task648 {
    public static void main(String[] args) {
        int c = 0;
        char[] a = CharArrayDeclaration.getDef_array();
        int n = a.length;
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 'x' && pos == -1) {
                pos = i;
            }
            if (a[i] == '0' && i > pos && pos != -1) {
                c++;

            }
        }
        System.out.println(c);


    }
}