package com.bdg.exercises_271_280;

public class App_276 {

    public static void main(String[] args) {
        boolean t = false;
        char[] chars = CharOperations.getDefaultCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'r') {
                t = true;
                break;
            }
        }
        System.out.println(t);
    }
}
