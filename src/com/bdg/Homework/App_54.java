package com.bdg.Homework;

public class App_54 {
    public static void main(String[] args) {

        int num = 444;
        int firstNum = num / 100;
        int midNum = num / 10 % 10;
        int lastNum = num % 10;

        if (firstNum > midNum && firstNum > lastNum) {
            System.out.println(firstNum);
        } else if (midNum > firstNum && firstNum > lastNum) {
            System.out.println(midNum);
        } else if (lastNum > firstNum && lastNum > midNum){
            System.out.println(lastNum);
        }
    }
}
