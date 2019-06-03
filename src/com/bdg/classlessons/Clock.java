package com.bdg.classlessons;

public class Clock {

    private int hours;
    private int minutes;
    private int seconds;

    public Clock(){
        hours = 12;
        minutes = 0;
        seconds = 0;

    }

    public Clock(int timeWithSeconds){
        hours = timeWithSeconds/3600;
        minutes = (timeWithSeconds - hours*3600)/60;
        seconds = (timeWithSeconds - hours*3600-minutes*60);
    }

    public Clock(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setClock(int timeWithSeconds){
        hours = timeWithSeconds/3600;
        minutes = (timeWithSeconds - hours*3600)/60;
        seconds = (timeWithSeconds - hours*3600-minutes*60);
    }

    public Clock tick(){
       seconds =  this.seconds+1;
        return this;
    }

    public void addClock(Clock clock){
        hours = this.hours+clock.hours;
        minutes = this.minutes+clock.minutes;
        seconds = this.seconds+clock.seconds;
    }


    public Clock tickDown(){
        seconds =  this.seconds-1;
        return this;
    }

    public Clock subtractClock(Clock clock){
        hours = this.hours-clock.hours;
        minutes = this.minutes-clock.minutes;
        seconds = this.seconds-clock.seconds;
        return this;

    }
    public String toString(){
      String result="";
        result+= (hours<10)?"0"+hours+":":hours+":";
        result+= (minutes<10)?"0"+minutes+":":minutes+":";
        result+= (seconds<10)?"0"+seconds:seconds;
        return result;
    }



}
