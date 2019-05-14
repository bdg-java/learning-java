package com.bdg.exercises_51_70;

public class App_61 {
    public static void main(String[] args) {
        int num = 1693;
        int miavor = num % 10;
        int tasnavor = num % 100 / 10;
        int hayruravor = (num / 100)%10;
        int hazaravot = num/1000;
        System.out.println(miavor);
        System.out.println(tasnavor);
        System.out.println(hayruravor);
        System.out.println(hazaravot);

    }
}
