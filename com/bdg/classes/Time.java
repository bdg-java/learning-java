package com.bdg.classes;

public class Time {
    private int  hour ;
    private int  minute ;
    private  int  second ;

    public  void  Time(int  hour , int  minute ,int  second){
        this.hour =hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (this.hour > 24 || this.hour < 0){
            System.out.println("Not valid time");
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (this.minute > 60 || this.minute< 0){
            System.out.println("Not valid time");
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (this.second > 60 || this.second < 0){
            System.out.println("Not valid time");
        }
        this.second = second;
    }
    public void setTime(int  hour , int  minute ,int  second) {

        this.hour  = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time nextSecond(){
        this.second++;
        if (this.second > 59 ){
            this.second = 0;
            this.minute++;
            if (this.minute > 59){
                this.minute = 0;
                this.hour++;
                if (this.hour>23)
                    this.hour=0;
            }
        }
        return nextSecond();
    }
    public Time previousSecond(){
        this.second--;
        if (this.second < 1 ){
            this.second = 59;
            this.minute--;
            if (this.minute < 1){
                this.minute = 59;
                this.hour--;
                if (this.hour < 1)
                    this.hour= 23;
            }
        }
        return previousSecond();
    }

    public String toString(){
        return this.hour+":"+ this.minute+":"+""+this.second;
    }


}
