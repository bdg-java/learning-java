package com.bdg.pastreapeat;

public class App_161 {

    public static void main(String[] args) {
        for (int i = 1000; i <9999 ; i++) {
            double num = Math.sqrt(i * 26);
            if (num == (int)num ){
                System.out.println(i);
                break;
            }
        }
    }
}
