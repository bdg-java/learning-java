package com.lesson5;

public class Task280 {
    public static void main(String[] args) {
        char[] a = CharArrayDeclaration.getDef_array();
        int n = a.length;
        char[] b = new char[2 * n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            b[j] = a[i];
            if (a[i] == 'f') {
                b[j + 1] = a[i];
                j++;
            }
            j++;
        }
        System.out.println(b);
    }
}
