package com.bdg.exercises_271_280;

public class App_274 {

    public static void main(String[] args) {
        char[] chars = CharOperations.getDefaultCharArray();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 'h') {
                sum += i;
                count++;
            }
        }
        if (count != 0) {
            System.out.println(sum / count);
        }

    }
}
