package com.bdg.lessonclasses;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth() {
        this.month = month;
    }

    public void setYear() {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year  = year;
    }

    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }

    public static void main(String[] args) {
        Date date = new Date(1,12,1990);
        System.out.println(date);
    }
}
