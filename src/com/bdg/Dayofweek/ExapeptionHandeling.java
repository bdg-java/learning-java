package com.bdg.Dayofweek;

public class ExapeptionHandeling {
    public static void main(String[] args) {

    try {
        Dayofweek day = Dayofweek.find("Monday");
    }catch (DayOfWeekNotFoundException aa){
            System.out.println(aa.getMessage());
        }
    }
}
