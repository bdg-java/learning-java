package com.lesson7;

public class Time {
    private int hour;
    private int minute;
    private int second;

    private Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static Time createTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23)
            return null;
        if (minute < 0 || minute > 59)
            return null;
        if (second < 0 || minute > 59)
            return null;
        return new Time(hour, minute, second);
    }

    public int getHour() {
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

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        String h = "";
        String m = "";
        String s = "";

        if (hour < 10)
            h = "0" + this.hour + ":";
        else h = this.hour + ":";

        if (minute < 10)
            m = "0" + this.minute + ":";
        else m = this.minute + ":";

        if (second < 10)
            s = "0" + this.second + ":";
        else s = this.second + "";

        return h + m + s;
    }

    public Time nextSecond() {
        this.second++;
        return this;
    }

    public Time previusSecond() {
        this.second--;
        return this;
    }
}

