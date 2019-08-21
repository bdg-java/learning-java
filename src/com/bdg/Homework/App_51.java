package com.bdg.Homework;

public class App_51 {
    public static void main(String[] args) {

        int number = 444;
        int firstNum = number / 100;
        int midNum = number / 10 % 10;
        int lastNum = number % 10;


        if (lastNum==firstNum+midNum){
            System.out.println("true");
        }else System.out.println("false");
    }
}
