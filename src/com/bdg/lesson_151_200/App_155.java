package com.bdg.lesson_151_200;

public class App_155 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 12;

//        for(num = 12;num<=99;num++)
//            if(num%3 == 0) {
//                sum = sum+num;
//            }
//        System.out.println(sum);

////////////////////////////////////////////////////////
        do {
            sum = sum + num;
            num = num + 3;
        }
        while (num<=99);
            System.out.println(sum);
            }
    }
