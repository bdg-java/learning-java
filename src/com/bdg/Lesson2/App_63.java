package com.bdg.Lesson2;

public class App_63 {
    public static void main(String[] args) {

        int wholeNum =4342;
        int a =wholeNum/1000;
        int b =wholeNum/100%10;
        int c =wholeNum/10%10;
        int d = wholeNum%10;

        if ((a == 1)||(b == 1)||(c == 1)||(d == 1)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
