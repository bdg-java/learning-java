package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task663 {
    public static void main(String[] args) {
        char[] a = CharArrayDeclaration.getDef_array();
        int n = a.length;
        int c = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 'c') {
                sum += i;
                c++;
            }
        }
        if (c > 0)
            System.out.println((double) sum / c);
        else System.out.println("Array doesn't contain c");
    }
}
