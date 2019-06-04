package com.bdg.Lesson_9;


public class Clock {

    private int hour;
    private int minute;
    private int second;

    public Clock() {

    }

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Clock(int second){
        while (second > 59) {
            if (second > 59) {
                minute += 1;
                second -= 60;
                if (minute > 59) {
                    hour += 1;
                }
            }
        }

    }
}
