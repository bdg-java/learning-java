package com.bdg.nhakobyan.lesson_4.since_100;

public class exercise_163 {
    public static void main(String[] args) {

        for (int x = 9999; x > 1000; x--) {
            if(Math.sqrt(18*x) % 2 == 0  ){
                System.out.println(x);
                break;
            }
        }

        for (double x = 9999; x > 1000  ; x--) {
            if (Math.sqrt(18 * x ) >= 420){
                System.out.print(Math.sqrt(x * 18)+" ");
                System.out.print("  the numb  "+x);
            }
            System.out.println();


        }
    }
}
