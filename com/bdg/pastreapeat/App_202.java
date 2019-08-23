package com.bdg.pastreapeat;

public class App_202 {
    public static void main(String args[]){
        int a = 13;
//        counter(a);
        System.out.println(135%10);
    }
    public static void counter(int num){
        Integer tmp = num;
        int count = 0;
        Integer  number = 0;
        while ( tmp!=0 ){
            tmp /= 10;
            number += tmp.toString().charAt(count);
            count++;
        }

        System.out.println(tmp);

    }
}
