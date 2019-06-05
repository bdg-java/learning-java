package com.bdg.lessonclasses;

import static java.time.Clock.tick;

public class ClockDemo {
    public static void main(String[] args) {

        Clock firstClock = new Clock(700);
        System.out.println(firstClock);


        Clock clock = new Clock();
//        clock.tick();
//        clock.tick();
//        clock.tick();
//        clock.tick();
//        clock.tick();
//        clock.tick();
//        clock.tick();
//        clock.tick();
//        clock.tick();
//        clock.tick();
//        clock.tick();
//        System.out.println(clock);


        for (int i = 0; i < 10; i++) {
            clock.tick();
        } System.out.println(clock);

        Clock seconClock = new Clock(10,11, 14);
        System.out.println(seconClock);

        for (int i = 0; i < 10; i++) {
            seconClock.tick();
            System.out.println(seconClock);
        }

        System.out.println(seconClock.addClock(firstClock));

}
}
