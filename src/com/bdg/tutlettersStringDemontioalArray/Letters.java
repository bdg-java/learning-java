package com.bdg.tutlettersStringDemontioalArray;
import java.util.Arrays;

public class Letters {
    public static void main(String[] args) {

        char[] text = {'a', 'b', '{', 'a', '5', 'j'};
        int c = 0;
        for (int i = 0; i < text.length; i++) {
            if ((text[i] >= 'A' && text[i] <= 'z') || (text[i] >= '0' && text[i] <= '9')) {
                c++;
            }
        }
        System.out.println(c);
    }
}

