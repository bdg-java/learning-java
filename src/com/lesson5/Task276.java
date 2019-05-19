package com.lesson5;

public class Task276 {
    public static void main(String[] args) {
        int c = 0;
        boolean t = false;
        char[] a = CharArrayDeclaration.getDef_array();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'r') {
                t = true;
                break;
            }
        }
        System.out.println(t);
    }
}
