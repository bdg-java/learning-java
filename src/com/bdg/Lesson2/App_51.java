package com.bdg.Lesson2;

public class App_51 {
    public static void main(String[] args) {

        boolean t = false;
        int wholeNum = 459;
        int firstDigit = wholeNum/100;
        int midDigit = wholeNum/10%10;
        int lastDigit = wholeNum%10;

        if(lastDigit == midDigit + firstDigit){
            t = true;
        }
        else{
            t = false;
        }
        System.out.println(t);
    }
}


