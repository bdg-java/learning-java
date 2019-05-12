package com.lesson3;

public class Task79 {
    public static void main(String[] args) {
        double y = 0;
        for (int x = -4; x < 5; x++) {
            if (x > 1)
                y += Math.log(x);
            else
                y += -9;
        }
        System.out.println(y);
    }
}
