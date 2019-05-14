package com.bdg.exercises_51_70;

public class App_58 {
    public static void main(String[] args) {
        int num = 202;
        int tasnavor = num % 100 / 10;
        int hayruravor = num / 100;
        char f;
        if (tasnavor + hayruravor < 5) {
            f = 'a';
        } else {
            f = 'b';
        }
        System.out.println(f);
    }
}
