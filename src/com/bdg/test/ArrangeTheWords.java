package com.bdg.test;

import java.util.Arrays;

public class ArrangeTheWords {

    private static String s = "The lines who are printed in reverse order.";

    public static void main(String[] args) {

        System.out.println(s);
        int countOfPrabels = 0;
        int k = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                countOfPrabels++;
            }
        }
        String[] words = new String[countOfPrabels+1];

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

        int[] wordsLengtharray = new int[words.length];
        for(int i = 0; i < words.length; i++){
            wordsLengtharray[i] = words[i].length();
        }
        System.out.println(Arrays.toString(wordsLengtharray));

        Arrays.sort(wordsLengtharray);
        System.out.println(Arrays.toString(wordsLengtharray));

        String[] arrangeWords = new String[words.length];
        int index = 0;
        for(String j : words){
            if (wordsLengtharray[0] == j.length()) {
                arrangeWords[index] = j;
                index++;
                break;
            }
        }
        int count = 0;
        String tmp = null;
        for(int i = 1; i < words.length; i++) {
            if (wordsLengtharray[i] != wordsLengtharray[i - 1]) {
                for (String j : words) {
                    if (wordsLengtharray[i] == j.length()) {
                        arrangeWords[index] = j;
                        index++;
                        break;
                    }
                }
            } else {
                count = 0;
                for (int z = 1; z < index; z++) {
                    if (wordsLengtharray[i] == wordsLengtharray[i - z]) {
                        count++;
                    }
                }
                System.out.println(count);
                for(int y = 0; y < count; y++) {
                    for (String j : words) {
                        if (wordsLengtharray[i] == j.length()) {
                            tmp = j;
                        }
                    }
                    arrangeWords[index] = tmp;
                    index++;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arrangeWords));
        String newString = "";
        for(String x:arrangeWords){
            newString = newString.concat(x).concat(" ");
        }

        String upperCaseFirstLetter = newString.substring(0,1).toUpperCase();
        String finallyString = upperCaseFirstLetter.concat(newString.substring(1,newString.length()-1)).concat(".");
        System.out.println(finallyString);
    }
}
