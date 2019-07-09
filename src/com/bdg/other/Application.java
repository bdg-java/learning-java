package com.bdg.other;


import java.awt.*;

/**
 * @author William Arustamyan
 */


public class Application {

    public static void main(String[] args) {

        Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 20);
//        System.out.println(p1.equals("XXX"));


        long[] array = new long[998];


        long num = array[array.length-1];
        for (int i = 0; i < array.length ; i++) {
            if (i > 1) {
                array[i] = i;
            }
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length ; i++) {
            /*if (Math.sqrt(array[(int)num])% 2 == 0 || Math.sqrt(array[(int)num]) %3 ==0 || Math.sqrt(array[(int)num])%5==0){
                System.out.println(Math.sqrt(array[(int)num]));
            }
            num--;*/


        }
    }
}
