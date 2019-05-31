package com.bdg.Lesson_6;

public class App_647 {
    public static void main(String[] args) {

        char[] n = {'5', '5', 'a', 'a', 'a', 'a', '5', '5'};
        boolean t = false;

        for (int i = 0; i < n.length; i++) {
            if (n[i] == n[n.length - 1 - i]) {
                t = true;
            } else {
                t = false;
            }
        }
        System.out.println(t);
    }
}
