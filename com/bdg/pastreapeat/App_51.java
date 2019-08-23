package com.bdg.pastreapeat;

public class App_51 {
    public static void main(String[] args) {
        int num = 123;
        boolean bool = false;
        if (num % 10 == ((num / 10) % 10) + (num / 100)) {
            bool = true;
        }
        System.out.println(bool);
    }
}
