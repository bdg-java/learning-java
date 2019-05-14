package com.bdg.lesson_151_200;

public class App_159 {
    public static void main(String[] args) {
        int pr=1;
        int num;

        //value is too big
        for(num=106;num<=999;num++)
            if(num%3==1 && num%4==2) {
                pr*=num;
            }
        System.out.println(pr);
    }
}
