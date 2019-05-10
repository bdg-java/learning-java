package com.bdg.Lesson2;

public class App_58 {
    public static void main(String[] args) {

        int wholeNum = 231;
        int firstNum = wholeNum/100;
        int midNum = wholeNum/10%10;

        if ((midNum + firstNum) < 5) {
            System.out.println("f=a");
        } else if ((midNum + firstNum) > 5){
            System.out.println("f=b");
        }
    }
}
