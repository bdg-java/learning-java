package com.bdg.LessonClass;

public class Date {
    int day  ;
    int  month;
    int  year;


    public Date(int  day, int  month, int year){
        day = this.day;
        month = this.month;
        year = this.year;

    }
//    public int getDay(){
//        return this.day;
//    }
//    public int getMonth(){
//        return this.month;
//    }
//    public int getYear(){
//        return this.year;
//    }
//
//    public void setDay(int day){
//      this.day = day;
//    }
//    public void setMonth(int month){
//        this.month = month;
//
//    }
//    public void setYear(int year){
//        this.year = year;
//
//    }
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString() {
        return  "[day + ,+ month + ,+ year";
    }


}
