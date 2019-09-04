package com.bdg.test;

import java.util.Arrays;

public class ArrangeTheWords {

    private static String s = "The lines who are printed her hat in reverse cat order i.";

    public static void main(String[] args) {

        System.out.println(s);

        if(s.length() >= 1 && s.length() < Math.pow(10,5)) {
            String[] words = s.split(" ");
            System.out.println(Arrays.toString(words));
            words[0] = words[0].toLowerCase();
            words[words.length - 1] = words[words.length - 1].substring(0, words[words.length - 1].length() - 1);
            System.out.println(Arrays.toString(words));

            int[] wordsLengtharray = new int[words.length];
            for (int i = 0; i < words.length; i++) {
                wordsLengtharray[i] = words[i].length();
            }
            System.out.println(Arrays.toString(wordsLengtharray));

            Arrays.sort(wordsLengtharray);
            System.out.println(Arrays.toString(wordsLengtharray));

            String[] arrangeWords = new String[words.length];
            int index = 0;
            for (String j : words) {
                if (wordsLengtharray[0] == j.length()) {
                    arrangeWords[index] = j;
                    index++;
                    break;
                }
            }
            String tmp = null;
            for (int i = 1; i < words.length; i++) {
                if (wordsLengtharray[i] != wordsLengtharray[i - 1]) {
                    for (String j : words) {
                        if (wordsLengtharray[i] == j.length()) {
                            arrangeWords[index] = j;
                            index++;
                            break;
                        }
                    }
                } else {
                    int count = 0;
                    for (int z = 1; z < index; z++) {
                        if (wordsLengtharray[i] == wordsLengtharray[i - z]) {
                            count++;
                        }
                    }
                    System.out.println(count);
                    int counter = 0;
                    for (String j : words) {
                        if (wordsLengtharray[i] == j.length()) {
                            tmp = j;
                            counter++;
                            if (counter == count + 1) {
                                arrangeWords[index] = tmp;
                                index++;
                                break;
                            }
                        }
                    }
                }
            }

            System.out.println(Arrays.toString(arrangeWords));
            String newString = "";
            for (String x : arrangeWords) {
                newString = newString.concat(x).concat(" ");
            }

            String upperCaseFirstLetter = newString.substring(0, 1).toUpperCase();
            String finallyString = upperCaseFirstLetter.concat(newString.substring(1, newString.length() - 1)).concat(".");
            System.out.println(finallyString);
        }
    }
}
