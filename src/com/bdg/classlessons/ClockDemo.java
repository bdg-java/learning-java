package com.bdg.classlessons;

public class ClockDemo {
    public static void main(String[] args) {

        Clock clock = new Clock(4560);
        //System.out.println(clock);
        Clock clockObj = new Clock();
        clockObj.tick();
        clockObj.tick();
        clockObj.tick();
        clockObj.tick();
        clockObj.tick();
        clockObj.tick();
        clockObj.tick();
        clockObj.tick();
        clockObj.tick();
       // System.out.println(clockObj);

        Clock firstClock = new Clock(45678);
        System.out.println(firstClock);
        Clock secondClock = new Clock(4546);
        System.out.println(secondClock);
        firstClock.addClock(secondClock);
        System.out.println(firstClock);


    }
}
