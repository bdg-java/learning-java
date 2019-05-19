package com.lesson5;

public class Task273 {
    public static void main(String[] args) {
        int c = 0;
        char[] a = CharArrayDeclaration.getDef_array();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 's')
                c += i;
        }
        System.out.println(c);
    }
}
