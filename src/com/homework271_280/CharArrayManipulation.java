package com.homework271_280;

import java.util.Random;

public class CharArrayManipulation {

    public static String alphabet = "abcdefghijklmnopqrstuvwqyz";

    public static char[] randomArray(int size) {
        char[] arr = new char[size];

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = alphabet.charAt(rand.nextInt(alphabet.length()));
        }

        return arr;
    }

    public static void arrayPrint(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.printf("%c", arr[i]);
            } else {
                System.out.printf("%c, ", arr[i]);
            }
        }
    }
}
