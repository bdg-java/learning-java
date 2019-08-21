package com.bdg.Homework;

public class App_59 {
    public static void main(String[] args) {

        int number = 281;
        int firstNum = number / 100;
        int midNum = number / 10 % 10;
        int lastNum = number % 10;


        if (firstNum > midNum && midNum > lastNum) {
            System.out.println(lastNum + " " + midNum + " " + firstNum);
        } else if (firstNum > lastNum && lastNum > midNum) {
            System.out.println(midNum + " " + lastNum + " " + firstNum);
        } else if (midNum > firstNum && firstNum > lastNum) {
            System.out.println(lastNum + " " + firstNum + " " + midNum);
        } else if (midNum > lastNum && lastNum > firstNum) {
            System.out.println(firstNum + " " + lastNum + " " + midNum);
        } else if (lastNum > midNum && midNum > firstNum) {
            System.out.println(firstNum + " " + midNum + " " + lastNum);
        } else if (lastNum > firstNum && firstNum > midNum) {
            System.out.println(midNum + " " + firstNum + " " + lastNum);
        }
    }
}
