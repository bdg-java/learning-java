package com.classwork8;

public class ClockDemo {
    public static void main(String[] args) {

        Clock clock = Clock.createTime(3, 20, 51);
        System.out.println(clock);
        Clock clock2 = new Clock(5623);
        System.out.println(clock2);
        Clock clock3 = clock.subtractClock(clock2);
        System.out.println(clock3);
        Clock clock4 = clock.addClock(clock2);
        System.out.println(clock4);
    }
}
