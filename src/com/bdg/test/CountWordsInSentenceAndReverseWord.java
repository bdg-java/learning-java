package com.bdg.test;

public class CountWordsInSentenceAndReverseWord {

    static String x = "-Abcd. vdd dssd dew + ddww, fre ijf... for!  u the iii new qwz wem oit you the chj ijyl ooo yup nwq jlkf nma.";

    static int z;

    public static void main(String[] args) {
        for(int i = 0; i < x.length()-1; i++) {
            if(x.charAt(i) == ' ' || x.charAt(i) == ',' || x.charAt(i) == '.' || x.charAt(i) == '!' || x.charAt(i) == '?') {
                if(x.charAt(i+1) != ' ' && x.charAt(i+1) != '.'&& x.charAt(i+1) != '+' && x.charAt(i+1) != '>' && x.charAt(i+1) != '<') {
                    z++;
                }
            }
        }

        System.out.println("Words in the sentence " + (z+1));

        String word = "levep";
        System.out.println(word);
        System.out.println(word.toUpperCase());
        for(int i = 0; i < word.length(); i++){
            System.out.print(word.charAt(word.length()-1-i));
        }

    }
}
