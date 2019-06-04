package com.bdg.Lesson_8;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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
    public void setTime(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString()
    {
        String time="";
        if(getHour() <10){
            time+="0"+getHour()+":";
        }else {
            time+=getHour()+":";
        }
        if(getMinute() <10){
            time+="0"+getMinute()+":";
        }else {
            time+=getMinute()+":";
        }
        if(getSecond() <10){
            time+="0"+getSecond();
        }else {
            time+=getSecond();
        }
        return  time;

    }

    public Time nextSecond(){
        if(getMinute() == 59){
            if(getSecond() == 59){
                setHour(getHour()+1);
                setMinute(0);
                setSecond(0);

            }else {
                setSecond(getSecond()+1);
            }
        }else {
            if(getSecond() == 59){
                setMinute(getMinute()+1);
                setSecond(0);

            }else {
                setSecond(getSecond()+1);
            }
        }

        return  new Time(this.hour,this.minute,this.second);

    }
    public Time previousSecond(){

        if(getMinute() == 0){
            if(getSecond() == 0){
                setHour(getHour()-1);
                setMinute(59);
                setSecond(59);

            }else {
                setSecond(getSecond()-1);
            }
        }else {
            if(getSecond() == 0){
                setMinute(getMinute()-1);
                setSecond(59);

            }else {
                setSecond(getSecond()-1);
            }
        }

        return  new Time(this.hour,this.minute,this.second);

    }
}
