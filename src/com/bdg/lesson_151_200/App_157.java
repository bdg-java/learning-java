package com.bdg.lesson_151_200;

public class App_157 {
    public static void main(String[] args) {
        int sum = 0;
        int num;

        for(num = 100;num<=999;num++)
            if(num%5 != 0) {
                sum += num;
            }
        System.out.println(sum);
    }
}
