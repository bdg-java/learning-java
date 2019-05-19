package com.lesson5;

public class Task272 {
    public static void main(String[] args) {
        int n = 15;
        int c = 0;
        boolean t = false;
        char[] a = CharArrayDeclaration.getDef_array();
        for (int i = 0; i < a.length; i++) {
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

