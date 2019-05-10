package com.bdg.Lesson2;

public class App_62 {
    public static void main(String[] args) {

        int wholeNum = 5453;
        int a =wholeNum/1000;
        int b =wholeNum/100%10;
        int c =wholeNum/10%10;
        int d =wholeNum%10;

        if (wholeNum < 5000){
            System.out.println(wholeNum / (a+c));
        }
        else if (wholeNum > 5000){
            System.out.println(wholeNum / (b+d));
        }
    }
}
