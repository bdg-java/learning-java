package com.bdg.agharibyan.uml_tasks.time;

public class Time {

    private int hour;
    private int minute;
    private int second;

    private Time(int hour, int minute, int second){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
    }
    public static Time createInstance(int hour, int minute, int second){
        if( isValidHour(hour) && isValidMinute(minute) && isValidSecond(second)){
            return new Time(hour, minute, second);
        }
        return null;
    }
    private static boolean isValidHour(int hour){
        return hour >= 0 && hour <= 23;
    }
    private static boolean isValidMinute(int minute){
        return minute >= 0 && minute <= 59;
    }
    private static boolean isValidSecond(int second){
        return second >= 0 && second <= 59;
    }
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public  void setSecond(int second){
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString(){
        String newHour = null;
        String newMinute = null;
        String newSecond = null;

        if (hour < 10){
           newHour = "0"+ this.hour;
        } else{
           newHour = this.hour + "";
        }
        if (minute < 10){
            newMinute = "0"+ this.minute;
        } else{
            newMinute = this.minute + "";
        }
        if (second < 10){
            newSecond = "0" + this.second;
        } else{
            newSecond = this.second + "";
        }
        return(newHour +":"+ newMinute +":"+ newSecond);
    }

    public Time nextSecond(){
        int nextsecond = second + 1;
        int nextminute;
        int nexthour;
        if (nextsecond == 60) {
            nextsecond = 0;
            nextminute = minute + 1;
            nexthour = hour;
            if (nextminute == 60) {
                nextminute = 0;
                nexthour = hour + 1;
                if (nexthour == 24) {
                    nexthour = 0;
                }
            }
        } else {
            nextminute = minute;
            nexthour = hour;
        }

        return new Time(nexthour, nextminute, nextsecond);
    }

    public Time previousSecond(){
        int previoussecond = second - 1;
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
        return new Time(previoushour, previousminute, previoussecond);
    }
}
