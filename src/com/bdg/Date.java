package com.bdg;

public class Date {

    private int day;
    private int month;
    private int year;
    private String format;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(int day, int month, int year, String format) {
        this(day, month, year);
        this.format = format;
    }


    public String toString() {
        String.format("%d/%d/%d", this.day, this.month, this.year);
        if (this.format != null) {

        }
//        return "Date [ Day : " + this.day + ", Month : " + this.month + ", Year : " + this.year + " ]";
        return String.format("%d/%d/%d", this.day, this.month, this.year);
    }
}
