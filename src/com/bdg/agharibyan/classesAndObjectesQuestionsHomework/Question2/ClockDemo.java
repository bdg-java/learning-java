package com.bdg.agharibyan.classesAndObjectesQuestionsHomework.Question2;

public class ClockDemo {
    public static void main(String[] args) {

        Clock firstClock = Clock.setClock(12345);
        for(int i = 1; i <= 10; i++) {
            firstClock.tick();
            System.out.println(firstClock);
        }

        Clock secondClock = new Clock( 1, 20, 0);
        for(int i = 1; i <= 10; i++) {
            secondClock.tick();
            System.out.println(secondClock);
        }

        firstClock.addClock(secondClock);

        firstClock.toString();

        secondClock.toString();

        Clock tirdClock = firstClock.subtrackClock(secondClock);

    }
}

//arajin toghis patcharov error unem.
//Exception in thread "main" java.lang.StackOverflowError errory :(
//chisht em haskanum, vor da kapvats e objectis steghtsman het?
