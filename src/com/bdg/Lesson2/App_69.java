package com.bdg.Lesson2;

public class App_69 {
    public static void main(String[] args) {

        int wholeNum = 1214;
        int a = wholeNum /1000;
        int b = wholeNum /100%10;
        int c = wholeNum /10%10;
        int d = wholeNum %10;

        if ((a + b + c + d) >20){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
