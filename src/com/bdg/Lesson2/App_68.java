package com.bdg.Lesson2;

public class App_68 {
    public static void main(String[] args) {

        int wholeNum = 1448;
        int a = wholeNum / 1000;
        int b = wholeNum / 100 % 10;
        int c = wholeNum / 10 % 10;
        int d = wholeNum % 10;

        if (d > c){
            System.out.println(d * b);
        }
        else {
            System.out.println("1");
        }
    }
}
