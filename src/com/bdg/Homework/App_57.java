package com.bdg.Homework;

public class App_57 {
    public static void main(String[] args) {

        int number = 444;
        int firstNum = number / 100;
        int midNum = number / 10 % 10;
        int lastNum = number % 10;

        if (number > 300){
            System.out.println(lastNum/midNum);
        }
        else{
            System.out.println(firstNum/lastNum);
        }
    }
}
