package com.lesson5;

public class Task278 {
    public static void main(String[] args) {
        char[] a = CharArrayDeclaration.getDef_array();
        char[] b = new char[a.length];
        int j = 0;
        for (int i = 1; i < a.length; i += 2) {
            b[j] = a[i];
            j++;
        }
        System.out.println(b);
    }
}
