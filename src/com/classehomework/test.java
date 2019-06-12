package com.classehomework;

public class test {
    public static void main(String[] args) {
        Time t = new Time(10, 50, 20);

        System.out.println(t.toString());

        t.nextSecond();

        System.out.println(t.toString());


    }
}
