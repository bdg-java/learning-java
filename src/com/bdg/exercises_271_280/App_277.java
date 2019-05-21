package com.bdg.exercises_271_280;

public class App_277 {

    public static void main(String[] args) {

        char[] chars = CharOperations.getDefaultCharArray();
        char[] newArray = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 'd') {
                newArray[i] = chars[i];
            }
        }
        System.out.println(newArray);
    }
}
