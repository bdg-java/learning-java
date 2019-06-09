package com.bdg.agharibyan.classesobjecteshomework.question2;

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

    public Clock(){
        this.hour = 12;
        this.minute = 0;
        this.second = 0;
    }

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Clock(int second) {
        this.second = second;
    }

    public static Clock setClock(int second) {
        int newhour;
        int newminute;
        int newsecond;
        newhour = (int)second / 60 / 60;
        newminute = (int)(second - newhour * 60 * 60) / 60;
        newsecond = (int)second - newhour * 60 * 60 - newminute * 60;
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
        this.second ++;
        if (this.second == 60) {
            this.second = 0;
            this.minute = this.minute + 1;
            if (this.minute == 60) {
                this.minute = 0;
                this.hour = this.hour + 1;
                if (this.hour == 24) {
                    this.hour = 0;
                }
            }
        }
        return creatClock(this.hour, this.minute, this.second);
    }

    public Clock addClock(Clock demoClock) {
        return creatClock(this.hour + demoClock.hour, this.minute + demoClock.minute, this.second + demoClock.second);
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
        } else Seconds = "" + this.second;
        return ("(" + Hours + ":" + Minutes + ":" + Seconds + ")");
    }

    public Clock tickDown(){
        this.second --;

        if(this.second == -1){
            this.second = 59;
            this.minute = minute - 1;
            this.hour = hour;
            if(this.minute == -1){
                this.minute = 59;
                this.hour = hour - 1;
                if(this.hour == -1){
                    this.hour = 23;
                }
            }
        }
        return creatClock(this.hour, this.minute, this.second);
    }

    public Clock subtrackClock(Clock demoClock){
        return creatClock(Math.abs(this.hour - demoClock.hour), Math.abs(this.minute - demoClock.minute), Math.abs(this.second - demoClock.second));
    }
}