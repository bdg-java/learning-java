package com.bdg.agharibyan.datewithstaticmethodcreation;

public class DateStatic {

    private int day;
    private int month;
    private int year;


    private DateStatic(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public static DateStatic createInstance(int day, int month, int year) {
        if (isValidDay(day) && isValidMonth(month) && isValidYear(year)) {
            return new DateStatic(day, month, year);
        }
        return null;
    }

    private static boolean isValidDay(int day) {
        return day > 0 && day < 31;
    }

    private static boolean isValidMonth(int month) {
        return month > 0 && month <= 12;
    }

    private static boolean isValidYear(int year) {
        return year > 1900 && year < 9999;
    }

}
