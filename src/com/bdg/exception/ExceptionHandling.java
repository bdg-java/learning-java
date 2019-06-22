package com.bdg.exception;

import com.bdg.enums.DayOfWeek;
import com.bdg.enums.DayOfWeekNotFoundException;

public class ExceptionHandling {

    public static void main(String[] args)  {

//        try {
//          write(0);
//        } catch (DataNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("FINALLY");
//        }
        try {

            DayOfWeek day = DayOfWeek.find("rrrrr");
        } catch (DayOfWeekNotFoundException ex) {
            System.out.println(ex.getMessage());
        }



    }


    public static void read() throws DataNotFoundException {

    }

    static void write(int x) throws DataNotFoundException {
        if (x == 0) {
            throw new DataNotFoundException();
        }
    }

    static void reWrite(int x) {
        try {
            write(x);
        } catch (DataNotFoundException e) {
            throw new RuntimeException();
        }
    }
}
