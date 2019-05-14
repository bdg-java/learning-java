package com.bdg.lesson_151_200;

public class App_156 {
    public static void main(String[] args) {
        int pr = 1;
        int num = 10;

        for(num = 10;num<=99;num++)
            if(num%3 == 0 && num%5 == 0) {
                pr = pr*num;
            }
        System.out.println(pr);
    }
}
