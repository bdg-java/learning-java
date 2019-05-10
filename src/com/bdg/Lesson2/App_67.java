package com.bdg.Lesson2;

public class App_67 {
    public static void main(String[] args) {

        int wholeNum = 1441;
        int a = wholeNum /1000;
        int b = wholeNum /100%10;
        int c = wholeNum /10%10;
        int d = wholeNum %10;

        if (wholeNum == (a+b+c+d) * (a+b+c+d)){

            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
