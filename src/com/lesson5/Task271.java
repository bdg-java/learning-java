package com.lesson5;

public class Task271 {
    public static void main(String[] args) {
        int c = 0;
        char[] a = CharArrayDeclaration.getDef_array();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == 'a')
                c++;
        }
        System.out.println(c);
    }
}
