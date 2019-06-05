package com.bdg.ClockHomework;

public class Clock {
    int hours;
    int minutes;
    int seconds;

    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Clock(int time) {
        hours = hours / time;
        minutes = (time - hours * 3600) / 60;
        seconds = (time - hours * 3600 - minutes) * 60;
    }

    public void setClock(int time) {
        hours = hours / time;
        minutes = (time - hours * 3600) / 60;
        seconds = (time - hours * 3600 - minutes) * 60;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int tick() {
        return this.seconds + 1;
    }

    public Clock addClock(int hours, int minutes, int seconds){
       hours = this.hours + hours;
       minutes = this.minutes + minutes;
       seconds = this.seconds + seconds;
        return this ;
    }
    public int tickDown() {
        return this.seconds + 1;
    }
    public String toString() {
        return String.format("d%:d%:d%", this.hours, this.minutes, this.seconds);
    }

    public Clock subTracktClock(Clock minus){
        Clock clockOne = new Clock();
        clockOne.hours = this.hours - minus.hours;
        clockOne.minutes = this.minutes - minus.minutes;
        clockOne.seconds = this.seconds - minus.seconds;
        return this ;

    }



}
