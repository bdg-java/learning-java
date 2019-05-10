package com.bdg.Lesson2;

public class App_66 {
    public static void main(String[] args) {

        int wholeNum =4694;
        int firstNum =wholeNum/1000;
        int lastNum =wholeNum%10;


        if ((firstNum ==4) && (lastNum == 4)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
