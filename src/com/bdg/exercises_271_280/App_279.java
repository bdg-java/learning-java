package com.bdg.exercises_271_280;

public class App_279 {
    public static void main(String[] args) {
        char[] chars = CharOperations.getDefaultCharArray();
        char[] newArray = new char[chars.length];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] > 'k') {
                newArray[i] = chars[i];
            }


        }
        System.out.println(newArray);
    }
}
