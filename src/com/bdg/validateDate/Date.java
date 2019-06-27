package com.bdg.validateDate;

 class Date {
    private int day;
    private int month;
    private int year;

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    int day() {
        return this.day;
    }

    int month() {
        return this.month;
    }

    int year() {
        return this.year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
