package com.bdg.Lesson2;

public class App_56 {
    public static void main(String[] args) {

        int wholeNum = 368;
        int firstNum = wholeNum / 100;
        int midNum = wholeNum / 10 % 10;
        int lastNum = wholeNum % 10;

        if (lastNum > midNum) {
            System.out.println(wholeNum / (firstNum + midNum + lastNum));

        } else if(lastNum < midNum ){
            System.out.println(wholeNum);
        }
    }
}
