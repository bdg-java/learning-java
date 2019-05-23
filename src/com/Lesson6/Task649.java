package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task649 {
    public static void main(String[] args) {
        int c = 0;
        char[] a = CharArrayDeclaration.getDef_array();
        int n = a.length;
        int firstposition = -1;
        int lastposition = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 'z' && firstposition == -1) {
                firstposition = i;
            }
            if (a[n - 1 - i] == 'z' && lastposition == -1 && firstposition < n - 1 - i) {
                lastposition = n - 1 - i;
            }
        }
        if (firstposition > -1 && lastposition > -1)
            c = lastposition - firstposition - 1;
        System.out.println(c);
    }
}
