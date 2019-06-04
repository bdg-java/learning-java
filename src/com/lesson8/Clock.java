package com.lesson8;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock() {
        hour = 12;
        minute = 0;
        second = 0;

    }

    private Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Clock(long time) {
        hour = (int) time / 3600;
        int t = (int) time - hour * 3600;
        minute = t / 60;
        t = t - minute * 60;
        second = t;
    }

    public static Clock createTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23)
            return null;
        if (minute < 0 || minute > 59)
            return null;
        if (second < 0 || second > 59)
            return null;
        return new Clock(hour, minute, second);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
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

    public void tick() {
        if (this.second >= 0 && this.second < 59)
            this.second++;
    }

    public Clock addClock(Clock c) {
        int diffsecond = 0;
        int diffminute = 0;
        int diffhour = 0;

        if (c.second + this.second >= 60) {
            ++this.minute;
            this.second -= 60;
        }
        diffsecond = this.second + c.second;
        if (c.minute + this.minute >= 60) {
            ++this.hour;
            this.minute -= 60;
        }

        diffminute = this.minute + c.minute;
        diffhour = this.hour + c.hour;
        return createTime(diffhour, diffminute, diffsecond);
    }

    public void tickDown() {
        if (this.second > 0 && this.second <= 59)
            this.second--;
    }

    public Clock subtractClock(Clock c) {
        int diffsecond = 0;
        int diffminute = 0;
        int diffhour = 0;

        if (c.second > this.second) {
            --this.minute;
            this.second += 60;
        }
        diffsecond = this.second - c.second;
        if (c.minute > this.minute) {
            --this.hour;
            this.minute += 60;
        }

        diffminute = this.minute - c.minute;
        diffhour = this.hour - c.hour;
        return createTime(diffhour, diffminute, diffsecond);
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
            s = "0" + this.second + "";
        else s = this.second + "";

        return h + m + s;
    }


}
