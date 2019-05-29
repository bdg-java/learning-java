package com.bdg.exercises_271_280;

import java.util.Random;

public class CharOperations {

    private static final char[] chars = {'s','d','8','f','m','l','b','s','o'};

    public static char[] getDefaultCharArray(){
        return chars;
    }

    public static char[] arrayWithGivenSize(int n)
    {
        Random random = new Random();
        String alphabet = "0123456789abcdefgghlmnopqrstuvwxyz";
        char[] chars = new char[n];
        for (int i =0;i<n;i++){
            chars[i] = alphabet.charAt(random.nextInt(alphabet.length()));
        }
        return  chars;
    }
}
