package com.bdg.agharibyan.classesobjecteshomework.question2;

public class ClockDemo {
    public static void main(String[] args) {

        Clock firstClock = Clock.setClock(14396);

        for(int i = 1; i <= 10; i++)
            System.out.println(firstClock.tick());

        Clock secondClock = new Clock( 1, 20, 0);
        System.out.println();
        for(int i = 1; i <= 10; i++) {
            System.out.println(secondClock.tickDown());
        }
        System.out.println();
        System.out.println(firstClock.addClock(secondClock));
        System.out.println();
        System.out.println(firstClock.toString());
        System.out.println();
        System.out.println(secondClock.toString());
        System.out.println();
        Clock thirdClock = firstClock.subtrackClock(secondClock);
        System.out.println(thirdClock.toString());

    }
}

