package com.bdg.Lesson2;

public class App_61 {
    public static void main(String[] args) {

    int wholeNum = 1441;
    int a = wholeNum /1000;
    int b = wholeNum /100%10;
    int c = wholeNum /10%10;
    int d = wholeNum %10;

    if ((a + b) == (c + d)){
        System.out.println("TRUE");
    }
    else {
        System.out.println("FALSE");
    }

   }
}
