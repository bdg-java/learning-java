package com.bdg.Lesson2;

public class App_64 {
    public static void main(String[] args) {

        int wholeNum =4923;

        int a =wholeNum/10%10;
        int b =wholeNum%10;

        if ((a + b) == 5){
            System.out.println("Y=S");
        }
        else{
            System.out.println("Y=D");
        }
    }
}
