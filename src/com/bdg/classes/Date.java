package com.bdg.classes;

public class Date {
    private int [] day = {1,31};
    private int[] month = {1,12};
    private int[] year = {1900,9999};

    public Date(int[] day ,int [] month ,int[] year){
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public int[] getDay() {
        return day;
    }

    public void setDay(int[] day) {
        this.day = day;
    }

    public int[] getMonth() {
        return month;
    }

    public void setMonth(int[] month) {
        this.month = month;
    }

    public int[] getYear() {
        return year;
    }

    public void setYear(int[] year) {
        this.year = year;
    }

    public void setDate(int day ,int month , int year){
        //to be continue...
    }
}
