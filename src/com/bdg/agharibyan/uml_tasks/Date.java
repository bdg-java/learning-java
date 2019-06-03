package com.bdg.agharibyan.uml_tasks;


public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        }
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
        if (year >= 1900 && year <= 9999) {
            this.year = year;
        }
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

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        int[] newDay = new int[2];
        if (this.day < 10) {
            newDay[0] = 0;
            newDay[1] = this.day;
        } else {
            newDay[0] = this.day / 10 % 10;
            newDay[1] = this.day % 10;
        }

        int[] newMonth = new int[2];
        if (this.month < 10) {
            newMonth[0] = 0;
            newMonth[1] = this.month;
        } else {
            newMonth[0] = this.month / 10 % 10;
            newMonth[1] = this.month % 10;
        }

        return (newDay + "/" + newMonth + "/" + this.year);
    }
    //kartsum em toStringi mej chpetq e interi zangvats grei, bayc 0neri greln ayspes patkeracreci
    //khndrum em asel ka ayl tarberak?
}
