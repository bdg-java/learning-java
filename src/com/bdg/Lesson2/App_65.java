package com.bdg.Lesson2;

public class App_65 {
    public static void main(String[] args) {
        int wholeNum =4943;

        int a =wholeNum/10%10;
        int b =wholeNum%10;

        if ((a * b) == 12){
            System.out.println("Y=12");
        }
        else{
            System.out.println("Y=0");
        }
    }
}
