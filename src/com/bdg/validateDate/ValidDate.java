package com.bdg.validateDate;

public class ValidDate {
    private Date originalDate;

    private ValidDate(int day, int month, int year) {
        this.originalDate = new Date(day, month, year);
    }

    public static ValidDate getInstance(int day, int month, int year) {
        if (day < 0 || month < 0 || year < 0) {
            System.out.println("Wrong parameters : day : " + day + " , month : " + month + " , year : " + year);
            return null;
        }
        return new ValidDate(day, month, year);
    }

    public int day() {
        return this.originalDate.day();
    }

    public int month() {
        return this.originalDate.month();
    }

    public int year() {
        return this.originalDate.year();
    }

    @Override
    public String toString() {
        return this.originalDate.toString();
    }
}
