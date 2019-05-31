package com.bdg.classes;

public class Time {
    private int [] hour = {0,23};
    private int [] minute = {0,59};
    private  int [] second = {0,59};

    public  void  Time(int [] hour , int [] minute ,int [] second){
        this.hour =hour;
        this.minute = minute;
        this.second = second;
    }

    public int[] getHour() {
        return hour;
    }

    public void setHour(int[] hour) {
        this.hour = hour;
    }

    public int[] getMinute() {
        return minute;
    }

    public void setMinute(int[] minute) {
        this.minute = minute;
    }

    public int[] getSecond() {
        return second;
    }

    public void setSecond(int[] second) {
        this.second = second;
    }
    public void setTime(int [] hour , int [] minute ,int [] second) {

        this.hour  = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time nextSecond(){
        this.second[1]++;
        if (this.second[1] > 59 ){
            this.second[1] = 0;
            this.minute[1]++;
            if (this.minute[1] > 59){
                this.minute[1] = 0;
                this.hour[1]++;
                if (this.hour[1]>23)
                    this.hour[1]=0;
            }
        }
        return nextSecond();
    }
    public Time previousSecond(){
        this.second[1]--;
        if (this.second[1] < 1 ){
            this.second[1] = 59;
            this.minute[1]--;
            if (this.minute[1] < 1){
                this.minute[1] = 59;
                this.hour[1]--;
                if (this.hour[1] < 1)
                    this.hour[1]= 23;
            }
        }
        return previousSecond();
    }

    /*public String toString(){
        return System.out.print(getHour()+":"+ getMinute()+":"+""+getSecond());
    }*/ //


}
