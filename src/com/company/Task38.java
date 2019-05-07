package com.company;

public class Task38 {
    public static void main(String[] args) {
        int a = 1, b = 3, c = 9, d = 27;

        float dif = (float)b / a;

        if (b * dif == c) {
            if (c * dif == d)
                System.out.println("True");
            else
                System.out.println("false");
        }
        else {
            System.out.println("false");
        }
    }
}
