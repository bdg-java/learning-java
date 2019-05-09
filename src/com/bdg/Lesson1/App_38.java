package com.bdg.Lesson1;

public class App_38 {
    public static void main(String[] args) {

        int a = 23;
        int b = 35;
        int c = 75;
        int d = 44;
        int r2 = (b - a);
        int r3 = (c - b);
        int r4 = (d - c);

            if (r2 == r3 && r3 == r4) {
                System.out.println("TRUE");
            }
            else{
                System.out.println("FALSE");
            }
    }
}
