package com.bdg.Lesson_6;

public class App_648 {
    public static void main(String[] args) {

        char[] n = {'0', 'g', 'x', '0', '0', '0', 'r', 'a'};
        int x = n.length;
        int z = 0;
        int a = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] == 'x' && n[i] == 0) {
                a = i;
            }
            if (n[i] == '0' && i > a && a != -1) {
                z++;
            }
        }
        System.out.println(z);
    }
}
