package com.bdg.Lesson2;

public class App_70 {
    public static void main(String[] args) {

        int wholeNum = 9678;
        int a = wholeNum /1000;
        int b = wholeNum /100%10;
        int c = wholeNum /10%10;
        int d = wholeNum %10;

        if ((a * b * c * d) > 200){
            System.out.println("0");
        }
        else {
            System.out.println("1");
        }
    }
}
