package com.bdg.test;

import java.util.Arrays;

public class ArrangeTheWords {

    private static String s = "The lines are printed in i reverse order.";

    public static void main(String[] args) {

        System.out.println(s);
        int count = 0;
        int k = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                count++;
            }
        }
        String[] words = new String[count+1];
        String[] arrangeWords = new String[words.length];
        int temp = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                words[k] = s.substring(temp,i).toLowerCase();
                temp = i+1;
                k++;
            }
        }
        words[k] = s.substring(temp,s.length()-1);
        System.out.println(Arrays.toString(words));

        int[] wordsLengtharray = new int[words.length]; // verjum kjnjem
        for(int i = 0; i < words.length; i++){
            wordsLengtharray[i] = words[i].length();
        }
        System.out.println(Arrays.toString(wordsLengtharray));

        Arrays.sort(wordsLengtharray);
        System.out.println(Arrays.toString(wordsLengtharray));

        int index = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if (wordsLengtharray[i] == words[j].length()) {
                    arrangeWords[index] = words[j];
                    index++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arrangeWords));
        String newString = "";
        for(int i = 0; i < arrangeWords.length; i++){
            newString = newString.concat(arrangeWords[i]).concat(" ");
        }

        System.out.println(newString);
    }
}
