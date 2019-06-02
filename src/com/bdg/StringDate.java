package com.bdg;

public class StringDate {

    private Date date;


    public StringDate(String d, String m, String y) {
        int day = Integer.parseInt(d);
        int month = Integer.parseInt(m);
        int year = Integer.parseInt(y);
        this.date = new Date(day, month, year);

    }
}
