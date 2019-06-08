package com.bdg.agharibyan.umlhomework.date;
public class Date {

    private int day;
    private int month;
    private int year;

    private Date(int day, int month, int year){
      this.day = day;
      this.month = month;
      this.year = year;
    }

    public static Date createInstance(int day, int month, int year){
        if(isValidDay(day) && isValidMonth(month) && isValidYear(year)){
            return new Date(day, month, year);
        }
        return null;
    }
    private static boolean isValidDay(int day){
        return day >= 1 && day <= 31;
    }
    private static boolean isValidMonth(int month){
        return month >= 1 && month <= 12;
    }
    private static boolean isValidYear(int year){
        return year >= 1900 && year <= 9999;
    }

    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString() {
        String newDay = null;
        String newMonth = null;

        if (day < 10){
            newDay = "0"+ this.day;
        } else {
            newDay = this.day +"";
        }
        if (month < 10){
            newMonth = "0"+ this.month;
        }
        else {
            newMonth = this.month + "";
        }
        return(newDay +"/"+ newMonth +"/"+ this.year);
    }
}
