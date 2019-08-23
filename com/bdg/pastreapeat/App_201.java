package com.bdg.pastreapeat;

public class App_201 {
    public static void main(String args[]){
        int a = 13485;
        counter(a);
    }
    public static void counter(int num){
        int tmp = num;
        int count = 0;
        while ( tmp!=0 ){
            tmp /= 10;
            count++;
        }

        System.out.println(count);

    }
}
