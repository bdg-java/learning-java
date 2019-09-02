package com.bdg.test;

public class PalindromeCounter {

    private static String s = "aaddvdccvccd";

    public static void main(String[] args) {

        System.out.println("String is " + s);
        int countPalindrome = 0;
        String palindrome;

        if (s.length() >= 1 && s.length() <= 5 * Math.pow(10, 3)) {
            boolean isConstrainValid = true;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) < 'a' || s.charAt(i) > 'z') {
                    System.out.println("String is not valid.");
                    isConstrainValid = false;
                    break;
                }
            }
            if (isConstrainValid) {
                for (int i = 0; i < s.length(); i++) {
                    palindrome = s.substring(i, i + 1);
                    countPalindrome++;
                    System.out.print("Palindrom is " + palindrome + " -> ");
                    System.out.println(countPalindrome);
                    for (int j = 0; j < s.length()-1-i; j++) {
                        if(s.charAt(j) == s.charAt(j+1+i)){
                            if(s.charAt(j+1) == s.charAt(j+i)) {
                                palindrome = s.substring(j, j + 2 + i);
                                countPalindrome++;
                                System.out.print("Palindrom is " + palindrome + " -> ");
                                System.out.println(countPalindrome);
                            }
                        }
                    }
                }
                System.out.println("Count of Palindroms is " + countPalindrome);
            }
        }
    }
}
