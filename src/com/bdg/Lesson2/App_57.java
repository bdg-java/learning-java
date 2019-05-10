package com.bdg.Lesson2;

public class App_57 {
    public static void main(String[] args) {

        int wholeNum = 343;
        int firstNum = wholeNum/100;
        int midNum   = wholeNum/10%10;
        int lastNum  = wholeNum%10;

        if ((wholeNum > 300)  ){
            System.out.println((float)(midNum/lastNum));
        } else if (wholeNum < 300){
            System.out.println((float)(firstNum/lastNum));
        }
    }
}
