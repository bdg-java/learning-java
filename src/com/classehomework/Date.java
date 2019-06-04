package com.classehomework;

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
        return day >= 1 && day <= 31 ? day : -1;
    }

    public int getMonth() {
        return month >= 1 && month <= 12 ? month : -1;
    }

    public int getYear() {
        return year >= 1900 && year <= 9999 ? year : -1;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (year >= 1900 && year <= 9999) {
            this.year = year;
        }
    }

    public void setDate(int day, int month, int year) {

    }

    @Override
    public String toString() {
        String day = null;
        String month = null;

        if (this.day < 10) {
            day = "0" + this.day;
        }
        if (this.month < 10) {
            month = "0" + this.month;
        }

        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
