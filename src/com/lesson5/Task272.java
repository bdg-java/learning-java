package com.lesson5;

public class Task272 {
    public static void main(String[] args) {
        int c = 0;
        boolean t = false;
        char[] a = CharArrayDeclaration.getDef_array();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == 'b')
                c++;
            if (c >= n / 2) {
                t = true;
                break;
            }
        }
        System.out.println(t);
    }
}

