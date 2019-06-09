package com.bdg;
  import java.time.LocalDateTime;
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

    public void setClock(int hours, int minutes, int seconds) {
        if (this.hours >= 0 && this.hours <= 23) {
            this.hours = hours;
        }
        if (this.minutes >= 0 && this.minutes <= 59) {
            this.minutes = minutes;
        }
        if (this.seconds >= 0 && this.seconds <= 59) {
            this.seconds = seconds;
        }
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
        return this.seconds - 1;
    }

    public String toString() {
        return String.format("d%:d%:d%", this.hours, this.minutes, this.seconds);
    }

    public Clock subtractClock(Clock clock) {
        hours = this.hours - clock.hours;
        minutes = this.minutes - clock.minutes;
        seconds = this.seconds - clock.seconds;
        return this;
    }




}
