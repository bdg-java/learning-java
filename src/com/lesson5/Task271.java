package com.lesson5;

public class Task271 {
    public static void main(String[] args) {
        int n = 11;
        int c = 0;
        char[] a = CharArrayDeclaration.getDef_array();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'a')
                c++;
        }
        System.out.println(c);
    }
}
