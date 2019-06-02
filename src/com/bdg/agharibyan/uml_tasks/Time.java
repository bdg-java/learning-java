package com.bdg.agharibyan.uml_tasks;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        if(hour >= 0 && hour <= 23){
            this.hour = hour;
        }
        if(minute >= 0 && minute <= 59){
            this.minute = minute;
        }
        if(second >= 0 && second <= 59){
            this.second = second;
        }
    }
    // chisht em anum, vor construktori mej em payman grum?
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
        int [] time = new int[3];
        time[0] = hour;
        time[1] = minute;
        time[2] = second;
    }
    // chisht em anum, vor interi zangvatsov em grum?
    public String toString(){
        int [] newHour = new int[2];
        if(this.hour < 10){
            newHour[0] = 0;
            newHour[1] = this.hour;
        } else{
            newHour[0] = this.hour/10%10;
            newHour[1] = this.hour%10;
        }

        int [] newMinute = new int[2];
        if(this.minute < 10){
            newMinute[0] = 0;
            newMinute[1] = this.minute;
        } else{
            newMinute[0] = this.minute/10%10;
            newMinute[1] = this.minute%10;
        }

        int [] newSecond = new int[2];
        if(this.second < 10){
            newSecond[0] = 0;
            newSecond[1] = this.second;
        } else{
            newSecond[0] = this.second/10%10;
            newSecond[1] = this.second%10;
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
    // ifers lriv skhal en? :)
}
