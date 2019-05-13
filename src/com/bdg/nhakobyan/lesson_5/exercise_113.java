package com.bdg.nhakobyan.lesson_5;

public class exercise_113 {
    public static void main(String[] args) {
        double x = 4;
        double y = 0;

        for (double n = 1; n <  10; n++) {
            y = (x - 1) / (Math.pow(x , 2) + 1) + 1/(2*n+1)*(x - 1) /(Math.pow(Math.pow(x,2)+1,2*n+1));

            System.out.println(y);
        }

    }
}
