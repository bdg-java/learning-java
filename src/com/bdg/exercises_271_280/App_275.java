package com.bdg.exercises_271_280;

public class App_275 {

    public static void main(String[] args) {
        char[] chars = CharOperations.getDefaultCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < 'k') {
                System.out.println(chars[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}
