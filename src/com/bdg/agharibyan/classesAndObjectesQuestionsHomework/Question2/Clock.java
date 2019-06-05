package com.bdg.agharibyan.classesAndObjectesQuestionsHomework.Question2;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public static Clock creatClock(int hour, int minute, int second) {
        if (isValidHour(hour) && isValidMinute(minute) && isValidSecond(second)) {
            return new Clock(hour, minute, second);
        }
        return null;
    }

    private static boolean isValidHour(int hour) {
        return hour >= 0 && hour <= 23;
    }

    private static boolean isValidMinute(int minute) {
        return minute >= 0 && minute <= 59;
    }

    private static boolean isValidSecond(int second) {
        return second >= 0 && second <= 59;
    }

    public static Clock createClockHoursmall12(int hour, int minute, int second) {
        if (isHoursmall12(hour)) {
            return new Clock(hour, minute, second);
        }
        return null;
    }

    private static boolean isHoursmall12(int hour) {
        return hour <= 11;
    }

    private Clock() {
    }

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private Clock(int second) {
        this.second = second;
    }

    public static Clock setClock(int second) {
        int newhour;
        int newminute;
        int newsecond;
        newhour = second / 60 / 12 % 10;
        newminute = (second - newhour * 12 * 60) / 60 % 10;
        newsecond = second - newhour * 12 * 60 - newminute * 60;
        return new Clock(newhour, newminute, newsecond);
    }

    public int getHours() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public Clock tick() {
        int nextsecond = this.second + 1;
        int nextminute;
        int nexthour;
        if (nextsecond == 60) {
            nextsecond = 0;
            nextminute = this.minute + 1;
            nexthour = this.hour;
            if (nextminute == 60) {
                nextminute = 0;
                nexthour = this.hour + 1;
                if (nexthour == 24) {
                    nexthour = 0;
                }
            }
        } else {
            nextminute = this.minute;
            nexthour = this.hour;
        }

        return new Clock(nexthour, nextminute, nextsecond);
    }

    Clock demoClock = Clock.creatClock(5, 20, 30);

    public Clock addClock(Clock demoClock) {
        return new Clock(this.hour + demoClock.hour, this.minute + demoClock.minute, this.second + demoClock.second);
    }

    public String toString() {
        String Hours = null;
        String Minutes = null;
        String Seconds = null;

        if (hour < 10) {
            Hours = "0" + this.hour;
        } else {
            Hours = "" + this.hour;
        }
        if (minute < 10) {
            Minutes = "0" + this.minute;
        } else {
            Minutes = "" + this.minute;
        }
        if (second < 10) {
            Seconds = "0" + this.second;
        } else {
            Seconds = "" + this.second;
        }
        return ("(" + Hours + ":" + Minutes + ":" + Seconds + ")");
    }

    public Clock tickDown(){
        int previoussecond = second -1;
        int previousminute;
        int previoushour;

        if(previoussecond == -1){
            previoussecond = 59;
            previousminute = minute - 1;
            previoushour = hour;
            if(previousminute == -1){
                previousminute = 59;
                previoushour = hour - 1;
                if(previoushour == -1){
                    previoushour = 23;
                }
            }
        } else {
            previousminute = minute;
            previoushour = hour;
        }
        return new Clock(previoushour,previousminute,previoussecond);
    }

    public Clock subtrackClock(Clock demoClock){
        return new Clock(this.hour - demoClock.hour, this.minute - demoClock.minute, this.second - demoClock.second);
    }

}