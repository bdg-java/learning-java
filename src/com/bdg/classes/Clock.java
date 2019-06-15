package com.bdg.classes;



public class Clock {
    private int seconds;
    private int minutes ;
    private int hours;

    public Clock() {
    }

    public Clock(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public Clock(long timeInSeconds) {
        for (int i = 0; i <timeInSeconds ; timeInSeconds--,i++) {
            seconds++;
            if (seconds == 59){
                minutes++;
                seconds = 0;
                if (minutes == 59){
                    minutes = 0;
                    hours++;
                }
            }
//            if (timeInSeconds <= 59 ){
//                this.seconds = timeInSeconds;
//            }
        }
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setClock(int timeInSeconds){
        for (int i = 0; i <timeInSeconds ; timeInSeconds--,i++) {
            seconds++;
            if (seconds == 59){
                minutes++;
                seconds = 0;
                if (minutes == 59){
                    minutes = 0;
                    hours++;
                }
            }
            if (timeInSeconds <= 59 ){
                this.seconds = timeInSeconds;
            }
        }
    }
    public int tick(){
        return this.seconds++;
    }
    public void addClock(Clock clock){
        this.seconds += clock.seconds;
        this.minutes += clock.minutes;
        this.hours += clock.hours;

    }

    @Override
    public String toString() {
        return  "Clock{" +
                "hours=" + hours+
                ", minutes=" + minutes +
                ", seconds=" + seconds+
                '}';
    }
}
