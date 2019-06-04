package com.lesson8;

public class ClockDemo {
    public static void main(String[] args) {
        Clock c = Clock.createTime(2, 15, 00);
        System.out.println(c);
        Clock c2 = new Clock(5623);
        System.out.println(c2);
        Clock c3 = c.subtractClock(c2);
        System.out.println(c3);
        Clock c4 = c.addClock(c2);
        System.out.println(c4);
    }
}
