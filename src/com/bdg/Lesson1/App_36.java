package com.bdg.Lesson1;

public class App_36 {
    public static void main(String[] args) {

        int a = 23;
        int b = 35;
        int c = 75;
        int d = 44;

        if ((a % 2 == 0 && b % 2 == 0)||(a % 2 == 0 && c % 2 == 0)||(a % 2 == 0 && d % 2 == 0)||(b % 2 == 0 && c % 2 == 0)||(b % 2 == 0 && d % 2 == 0)||(c % 2 == 0 && d % 2 == 0)){
            System.out.println("2");
        }
        else {
            System.out.println(1);
        }
    }
}
