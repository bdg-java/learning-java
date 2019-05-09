package com.bdg.Lesson2;

public class App_54 {
    public static void main(String[] args) {

        int wholeNum = 928;
        int firstNum = wholeNum / 100;
        int midNum = wholeNum / 10 % 10;
        int lastNum = wholeNum % 10;

        if (firstNum > midNum && firstNum > lastNum){
            System.out.println("The maximum value is "+firstNum);
        }
        else if (midNum > firstNum && midNum >lastNum){
            System.out.println("The maximum value is "+midNum);
        }
        else if (lastNum > firstNum && lastNum >midNum){
            System.out.println("The maximum value is "+lastNum);
        }
    }
}