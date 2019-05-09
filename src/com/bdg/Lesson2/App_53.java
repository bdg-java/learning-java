package com.bdg.Lesson2;

public class App_53 {
    public static void main(String[] args) {

        int wholeNum = 699;
        int firstNum = wholeNum / 100;
        int midNum = wholeNum / 10 % 10;
        int lastNum = wholeNum % 10;
        int k = wholeNum /( firstNum + midNum + lastNum);

        System.out.println(k);
    }
}
