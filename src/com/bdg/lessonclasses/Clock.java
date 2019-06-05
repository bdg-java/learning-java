package com.bdg.lessonclasses;

public class Clock {
private int hours;
private int minutes;
private int seconds;

public Clock() {
    hours = 12;
    minutes = 0;
    seconds = 0;
}

public Clock(int hours, int minutes, int seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
}


public Clock(int timeWithSeconds) {
    hours = timeWithSeconds/3600;
//    int h = timeWithSeconds%3600;
    minutes = (timeWithSeconds - hours*3600)/60;
//    int m = (timeWithSeconds%3600)%60;
    seconds = (timeWithSeconds - hours*3600 - minutes*60);
}

public void setClock(int timeWithSeconds) {
    hours = timeWithSeconds/3600;
//    int h = timeWithSeconds%3600;
    minutes = (timeWithSeconds - hours*3600)/60;
//    int m = (timeWithSeconds%3600)%60;
    seconds = (timeWithSeconds - hours*3600 - minutes*60);
}

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
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
    seconds = seconds + 1;
    return seconds;
    }

    public Clock addClock(Clock obj) {
        hours = this.hours + obj.hours;
        minutes = this.minutes + obj.minutes;
        seconds = this.seconds + obj.seconds;
        return this;
    }

    public String toString() {
       return this.hours + ":" + this.minutes + ":" + this.seconds;
    }

    public int tickDown() {
    seconds = this.seconds - 1;
    return seconds;
    }

    public Clock subtractCLock(Clock obj1) {
        hours = this.hours - obj1.hours;
        minutes = this.minutes - obj1.minutes;
        seconds = this.seconds - obj1.seconds;
        return this;
    }


}
